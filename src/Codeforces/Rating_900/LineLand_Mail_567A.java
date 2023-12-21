package Codeforces.Rating_900;

import java.util.Arrays;
import java.util.Scanner;

public class LineLand_Mail_567A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        for(int i=0; i<n; i++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int j=0; j<n; j++){
                if(i!=j){
                    max = Math.max(Math.abs(arr[i]-arr[j]),max);
                    min = Math.min(Math.abs(arr[i]-arr[j]),min);
                }
            }
            System.out.println(min+" "+max);
        }
    }
}
