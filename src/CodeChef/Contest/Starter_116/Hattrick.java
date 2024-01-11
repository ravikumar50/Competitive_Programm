package CodeChef.Contest.Starter_116;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Hattrick
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){

            String s = "";
            for(int i=0; i<6; i++){
                char ch = sc.next().charAt(0);
                s=s+ch;
            }
            if(s.contains("WWW")){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }

    }
}
