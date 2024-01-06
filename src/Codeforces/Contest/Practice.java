package Codeforces.Contest;

import java.util.*;

public class Practice {

    static void helper(int arr[], int idx){
        if(idx<0){
            return;
        }
        System.out.print(arr[idx]+" ");
        helper(arr,idx-1);
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,8,9,0};
        helper(arr,arr.length-1);
    }

}
