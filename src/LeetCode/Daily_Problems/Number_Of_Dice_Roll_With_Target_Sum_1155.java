package LeetCode.Daily_Problems;

import java.util.Arrays;

public class Number_Of_Dice_Roll_With_Target_Sum_1155 {

    static int dp[][];
    static int mod = 1000000007;


    static int helper(int n, int k, int target){
        if(n==0 && target==0) return 1;
        if(n<=0 || target<=0) return 0;

        if(dp[n][target]!=-1) return dp[n][target];

        int ans = 0;

        for(int i=1; i<=k; i++){
            ans = (ans%mod+helper(n-1,k,target-i)%mod)%mod;
        }
        return dp[n][target] = ans%mod;
    }


    public static void main(String[] args) {
        int n = 2;
        int k = 6;
        int target = 7;

        dp = new int[35][1005];
        for(var a : dp) Arrays.fill(a,-1);
        int ans = helper(n,k,target);
        System.out.println(ans);

    }
}
