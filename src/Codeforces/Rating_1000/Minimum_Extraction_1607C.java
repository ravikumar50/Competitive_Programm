package Codeforces.Rating_1000;

import java.util.*;

// gives TLE

public class Minimum_Extraction_1607C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();

            for(int i=0; i<n; i++) arr.add(sc.nextInt());
            Collections.sort(arr);

            int ans = Integer.MIN_VALUE;
            while(arr.size()>1){
                int a = arr.remove(0);
                ans = Math.max(ans,a);
                for(int i=0; i<arr.size(); i++){
                    arr.set(i,arr.get(i)-a);
                }
            }
            ans = Math.max(arr.get(0),ans);
            System.out.println(ans);
            t--;
        }
    }
}
