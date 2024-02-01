package CodeChef.Contest.Starter_119;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Judged {
    public static void main (String[] args) throws java.lang.Exception{
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int count = 0;
            for(int i=0; i<5; i++){
                int a = sc.nextInt();
                if(a==1) count++;
            }
            if(count>=4){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }

    }
}

