package Codeforces.Rating_1000;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci_army {

    static int dp[];

    static int helper(int n){
        if(n==0 || n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        else return dp[n] = helper(n-1)+helper(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans = helper(n);
        System.out.println(ans);
    }
}
