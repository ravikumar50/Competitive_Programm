package Codeforces.Rating_800;

import java.util.Scanner;

public class Reconnaissance_32A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i!=j && Math.abs(arr[i]-arr[j])<=d) ans++;
            }
        }
        System.out.println(ans);
    }
}
