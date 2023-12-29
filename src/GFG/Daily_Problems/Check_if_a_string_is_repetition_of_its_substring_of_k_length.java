package GFG.Daily_Problems;

import java.util.HashMap;

public class Check_if_a_string_is_repetition_of_its_substring_of_k_length {
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
