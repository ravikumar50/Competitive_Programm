package CodeChef.Contest.Starter_120;
import java.util.*;
import java.lang.*;
import java.io.*;

class Sub_or_Swp
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            while(x>=0){
                if(x>y){
                    int a = x;
                    x = y;
                    y = a;
                }else{
                    int a = x;
                    int b = y;
                    x = b-a;
                    y = a;
                }
            }
            System.out.println(y);
            t--;
        }

    }
}
