package Codeforces.Rating_900;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Twins_160A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        Integer arr[] = new Integer[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr,Collections.reverseOrder());
        int ans = 0;

        int currSum = 0;
        for(int i=0; i<n; i++){
            currSum+=arr[i];
            sum-=arr[i];
            ans++;
            if(currSum>sum) break;
        }
        System.out.println(ans);
    }
}
