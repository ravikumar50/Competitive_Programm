package Codeforces.Rating_900;

import java.util.Arrays;
import java.util.Scanner;

public class Sales_34B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int idx = 0;
        int ans = 0;
        while(idx<arr.length && m>0){
            if(arr[idx]<0){
                ans = ans+(-arr[idx]);
                m--;
                idx++;
            }else break;
        }
        System.out.println(ans);
    }
}
