package GFG.Daily_Problems;

import java.util.*;
public class Occurance_more_than_n_by_k {
    public static int countOccurence(int[] arr, int n, int k)
    {
        // your code here,return the answer   }
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i=0; i<n; i++){
            hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
        }

        int ans = 0;
        for(var a : hp.keySet()){
            if(hp.get(a)>(n/k)) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {3,1,2,2,1,2,3,3};
        int n = arr.length;
        int k = 4;

        System.out.println(countOccurence(arr,n,k));
    }
}
