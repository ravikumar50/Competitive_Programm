package LeetCode.Daily_Problems;

import java.util.*;
public class Minimum_Number_Of_Operation_To_Make_Array_Empty {

    public static int minOperations(int[] arr) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        int n = arr.length;

        for(int i=0; i<n; i++){
            hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
        }
        int ans = 0;
        for(var a : hp.values()){
            if(a==1) return -1;
            ans += a/3;
            if(a%3>0) ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,3,2,2,4,2,3,4};
        int ans = minOperations(arr);
        System.out.println(ans);
    }
}
