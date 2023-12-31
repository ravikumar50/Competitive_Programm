package GFG.Daily_Problems;
import java.util.*;
public class New_Year_Resolution {

    static int dp[][];

    static int helper(int arr[], int idx, int sum){
        if((sum != 0) && (sum%20 == 0 || sum %24 == 0 || sum == 2024)){
            return 1;
        }
        if(idx>=arr.length) return 0;

        if(dp[idx][sum]!=-1) return dp[idx][sum];

        int a = helper(arr,idx+1,sum+arr[idx]);
        int b = helper(arr,idx+1,sum);

        if(a==0 && b==0) return dp[idx][sum] = 0;
        else return dp[idx][sum] = 1;
    }
    public static void main(String[] args) {

        int arr[] = {5, 8, 9, 10, 14, 2, 3, 5};
        dp = new int[380][2030];
        for(var a : dp) Arrays.fill(a,-1);
        int ans = helper(arr,0,0);

        System.out.println((ans==1) ? true : false);

    }
}
