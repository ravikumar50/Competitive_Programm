package Codeforces.Rating_1000;

import java.util.Scanner;

public class Bear_and_Finding_Criminals_680B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt()-1;
        int arr[] = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        int i = a-1;
        int j = a+1;
        int ans = arr[a];
        while(i>=0 && j<n){
            if(arr[i]+arr[j]==2) ans+=2;
            i--;
            j++;
        }
        if(i<0){
            while(j<n) ans = ans+arr[j++];
        }else{
            while(i>=0) ans = ans+arr[i--];
        }
        System.out.println(ans);
    }
}
