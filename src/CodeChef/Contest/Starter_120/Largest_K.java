package CodeChef.Contest.Starter_120;
import java.util.*;
import java.lang.*;
import java.io.*;

class Largest_K
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(y/(x-1));
            t--;
        }

    }
}
