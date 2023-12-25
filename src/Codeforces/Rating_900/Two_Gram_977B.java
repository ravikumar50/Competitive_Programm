package Codeforces.Rating_900;

import java.util.*;

public class Two_Gram_977B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        HashMap<String,Integer> hp = new HashMap<>();

        for(int i=0; i<=n-2; i++){
            String x = s.substring(i,i+2);
            hp.put(x,hp.getOrDefault(x,0)+1);
        }

        String ans = "";
        int max = 0;

        for(var a : hp.keySet()){
            if(hp.get(a)>max){
                ans = a;
                max = hp.get(a);
            }
        }
        System.out.println(ans);
    }
}
