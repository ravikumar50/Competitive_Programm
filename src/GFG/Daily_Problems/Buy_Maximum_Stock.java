package GFG.Daily_Problems;

import java.util.*;

/*
 In a stock market, there is a product with its infinite stocks. The stock prices are given for
 N days, where price[i] denotes the price of the stock on the ith day.
 There is a rule that a customer can buy at most i stock on the ith day.
 If the customer has an amount of k amount of money initially. The task is to find out the maximum
 number of stocks a customer can buy.
 */
public class Buy_Maximum_Stock {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        int arr[][] = new int[n][2];
        for(int i=0; i<n; i++){
            arr[i] = new int[]{price[i],i+1};
        }

        Arrays.sort(arr,(a,b)->(a[0]-b[0]));

        int idx = 0;
        int ans = 0;

        while(idx<n){
            int x = k/arr[idx][0];
            x = Math.min(x,arr[idx][1]);

            k = k-arr[idx][0]*x;
            if(k<0) break;
            idx++;
            ans = ans + x;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10,7,19};
        int k = 45;

        System.out.println(buyMaximumProducts(arr.length,k,arr));
    }
}
