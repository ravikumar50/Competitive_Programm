package GFG.Daily_Problems;

import java.util.*;
public class Find_duplicate_rows_in_a_binary_matrix {
    public static ArrayList<Integer> repeatedRows(int arr[][], int m, int n)
    {
        //code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<String> hp = new HashSet<>();

        for(int i=0; i<m; i++){
            String s = "";
            for(int j=0; j<n; j++){
                s+=String.valueOf(arr[i][j]);
            }
            if(hp.contains(s)) ans.add(i);
            else hp.add(s);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,0},{1,0}};
        int m = 2;
        int n = 2;
        System.out.println(repeatedRows(arr,m,n));
    }
}
