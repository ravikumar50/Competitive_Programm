package LeetCode.Daily_Problems;

import java.util.*;

public class Minimum_Difficulty_Of_A_Job_Schedule_1335 {

    static int dp[][];

    static int helper(int i, int d, int arr[]){
        int n = arr.length;
        if(d==0 && i==n) return 0;
        if(d<=0 || i>=n) return Integer.MAX_VALUE;

        if(dp[i][d]!=-1) return dp[i][d];

        int currMax = arr[i];
        int ans = Integer.MAX_VALUE;

        for(int x=i; x<n; x++){
            currMax = Math.max(currMax,arr[x]);
            int a = helper(x+1,d-1,arr);
            if(a!=Integer.MAX_VALUE){
                ans = Math.min(ans,currMax+a);
            }
        }
        return dp[i][d] = ans;
    }


    public static void main(String[] args) {

        int arr[] = {6,5,4,3,2,1};
        int d = 2;
        dp = new int[305][15];
        for(var a : dp) Arrays.fill(a,-1);

        int ans = helper(0,d,arr);
        if(ans == Integer.MAX_VALUE) {
            System.out.println(-1);
        }else{
            System.out.println(ans);
        }

    }
}
