package CodeChef.Contest.Starter_121_DIV2;
import java.util.*;
import java.lang.*;
import java.io.*;

class Caesar_Cipher_Lite
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            int ans[] = new int[n];
            for(int i=0; i<n; i++){
                char ch1 = s1.charAt(i);
                char ch2 = s2.charAt(i);

                int count = 0;

                while(ch1!=ch2){
                    if(ch1=='X'){
                        ch1 = 'A';
                    }else if(ch1=='Y'){
                        ch1 = 'B';
                    }else if(ch1=='Z'){
                        ch1 = 'C';
                    }else{
                        ch1 = (char)(ch1+3);
                    }
                    count++;
                }
                ans[i] = count;
            }

            for(int i=0; i<n; i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
            t--;
        }

    }
}
