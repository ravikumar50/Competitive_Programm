package CodeChef.Contest.Starter_116;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ORST
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[m];

            for(int i=0; i<n; i++){
                arr1[i] = sc.nextInt();
            }

            int max = Integer.MIN_VALUE;

            for(int i=0; i<m; i++){
                int a = sc.nextInt();
                max = Math.max(max,a);
            }

            Arrays.sort(arr1,n-max,n);

            for(int i=0; i<n; i++){
                System.out.print(arr1[i]+" ");
            }
            System.out.println();
            t--;
        }

    }
}
