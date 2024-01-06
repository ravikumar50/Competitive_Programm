package Codeforces.Rating_1100;

import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        arr[0] = sc.nextInt();
        for(int i=1; i<n; i++){
            arr[i] = sc.nextInt()+arr[i-1];
        }
        int ans = 0;
        int sum = arr[k-1];
        int j = k;
        int i = 0;
        while(j<n){
            int a = arr[j]-arr[i];
            if(a<sum){
                ans = i+1;
                sum = a;
            }
            j++;
            i++;
        }
        System.out.println(ans+1);
    }
}
