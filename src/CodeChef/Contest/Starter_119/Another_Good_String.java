package CodeChef.Contest.Starter_119;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Another_Good_String

{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            String s = sc.next();

            int count = 1;
            int ans = 1;
            char prev = s.charAt(0);
            for(int i=1; i<n; i++){
                if(s.charAt(i)==prev){
                    count++;
                    ans = Math.max(ans,count);
                }else{
                    count=1;
                    prev = s.charAt(i);
                }
            }
            ans = Math.max(ans,count);
            System.out.print(ans+" ");
            char last = s.charAt(n-1);
            int lastfreq = 1;
            int idx = n-2;
            while(idx>=0 && s.charAt(idx)==last){
                lastfreq++;
                idx--;
            }

            for(int i=0; i<q; i++){
                char ch = sc.next().charAt(0);
                if(ch==last){
                    lastfreq++;
                    ans = Math.max(ans,lastfreq);
                }else{
                    lastfreq=1;
                    last = ch;
                }
                System.out.print(ans+" ");
            }
            System.out.println();
            t--;
        }

    }
}
