package GFG.Daily_Problems;

import java.util.Scanner;

/*
 Given an array of integers nums and a number k, write a function that returns true if given
 array can be divided into pairs such that sum of every pair is divisible by k.

 */
public class Array_Pair_Sum_Divisibility_Problem {
    public static boolean canPair(int[] arr, int k) {
        // Code here
        int n = arr.length;
        if(n%2!=0) return false;
        int freq[] = new int[k];

        for(int i=0; i<n; i++){
            freq[arr[i]%k]++;
        }

        for(int i=1; i<k; i++){
            int a = freq[i];
            int b = freq[k-i];
            if(a!=b) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {9, 5, 7, 3};
        int k = 6;
        boolean ans = canPair(arr,k);
        System.out.println(ans);
    }
}
