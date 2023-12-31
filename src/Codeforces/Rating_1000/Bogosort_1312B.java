package Codeforces.Rating_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Bogosort_1312B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            Integer arr[] = new Integer[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr,(a,b)->(b-a));
            for(int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            t--;
        }
    }
}
