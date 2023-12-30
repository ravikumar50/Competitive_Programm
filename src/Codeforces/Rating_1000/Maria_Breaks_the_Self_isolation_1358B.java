package Codeforces.Rating_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Maria_Breaks_the_Self_isolation_1358B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int count = 0;
            for(int i=n-1; i>=0; i--){
                if(arr[i]<=(i+1)){
                    System.out.println(i+2);
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(1);
            }
            t--;
        }
    }
}
