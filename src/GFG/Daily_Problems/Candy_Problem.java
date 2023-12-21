package GFG.Daily_Problems;

import java.util.*;

/*
There are N children standing in a line. Each child is assigned a rating value given in the integer array ratings.
You are giving candies to these children subjected to the following requirements:

Each child must have atleast one candy.
Children with a higher rating than it's neighbours get more candies than neighbors.
Return the minimum number of candies you need to have to distribute.

ex = arr[] = {1,2,2}
    output = 4
 */
public class Candy_Problem {

    static int minCandy(int n, int arr[]) {
        // code here
        if(n==1) return 1;
        int ans[] = new int[n];


        Arrays.fill(ans,1);

        // right

        for(int i=n-2; i>=0; i--){
            if(arr[i]>arr[i+1]) ans[i] = ans[i+1]+1;
        }

        // left

        for(int i=1; i<n; i++){
            if(arr[i]>arr[i-1]){
                ans[i] = Math.max(ans[i],ans[i-1]+1);
            }
        }
        int sum = 0;
        for(int i=0; i<n; i++) sum+=ans[i];
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2};
        System.out.println(minCandy(arr.length,arr));
    }
}
