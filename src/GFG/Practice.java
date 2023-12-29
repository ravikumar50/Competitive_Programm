package GFG;

import java.util.*;

/*
 Given a string s, check if it is possible to convert it into a string that is the
 repetition of a substring of length k. To convert, we will select two substrings,
 of length k starting at index i and j (zero-based indexing) such that i and j
 are divisible by k, and we will replace one substring with the other.
 */
public class Practice {

    static int kSubstrConcat(int n, String s, int k) {
        // Your Code Here
        if(n==k) return 1;
        if(n%k!=0) return 0;

        HashMap<String,Integer> hp = new HashMap<>();

        for(int i=0; i<n; i=i+k){
            String str = s.substring(i,i+k);
            hp.put(str,hp.getOrDefault(str,0)+1);
        }

        if(hp.size()==1) return 1;
        if(hp.size()!=2) return 0;

        int size = 0;
        for(var a : hp.values()){
            size = a;
            break;
        }

        if(size==(n/k-1) || size==1) return 1;
        else return 0;

    }
    public static void main(String[] args) {
        int n = 24;
        int k = 6;
        String s = "zedsfbkxgxpzzedsfbzedsfb";
        int ans = kSubstrConcat(n,s,k);
        System.out.println(ans);
    }
}
