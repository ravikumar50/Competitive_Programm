package CodeChef;

import java.util.*;
public class Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {14,12,14,14,12,14,14,12,12,12,12,14,14,12,14,14,14,12,12};

        HashMap<Integer,Integer> hp = new HashMap<>();
        int n = arr.length;

        for(int i=0; i<n; i++){
            hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
        }
        System.out.println(hp);
        int ans = 0;
        for(var a : hp.values()){
            if(a%2!=0 && a%3!=0) return;
            if(a%3==0) ans += a/3;
            else ans += a/2;
        }


    }
}
