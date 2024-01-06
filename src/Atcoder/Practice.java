package Atcoder;
import java.util.Scanner;
import java.util.Arrays;

public class Practice {

    public static int minPenalty(int[] a) {
        int n = a.length;

        // Calculate prefix sum to efficiently compute penalties
        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + a[i - 1];
        }

        // Initialize dp array to store minimum penalty
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        // Dynamic Programming to find minimum penalty
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                int penalty = prefixSum[i] - prefixSum[j];
                dp[i] = Math.min(dp[i], dp[j] + penalty);
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(2^1^3^4);
    }
}