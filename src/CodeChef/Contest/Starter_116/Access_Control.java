package CodeChef.Contest.Starter_116;
import java.util.*;
import java.lang.*;

public class g

{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            String s = sc.next();
            int curr = 0;
            int count = 0;
            for(int i=0; i<n; i++){
                char ch = s.charAt(i);
                if(ch=='1'){
                    curr=x;
                }else{
                    if(curr>0) curr--;
                    else{
                        count=1;
                        break;
                    }
                }
            }

            if(count==1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
            t--;
        }

    }
}

