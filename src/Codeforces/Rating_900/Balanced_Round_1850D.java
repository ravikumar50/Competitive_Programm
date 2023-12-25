package Codeforces.Rating_900;

import java.util.Arrays;
import java.util.Scanner;

public class Balanced_Round_1850D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++) arr[i] = sc.nextInt();

            Arrays.sort(arr);
            int ans = 1;
            int count = 1;

            for(int i=1; i<n; i++){
                if(arr[i]-arr[i-1]>k){
                    count = 1;
                }else{
                    ++count;
                }
                ans = Math.max(ans,count);
            }
            System.out.println(n-ans);
            t--;
        }
    }
}
