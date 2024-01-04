package Codeforces.Rating_1000;

import java.util.Arrays;
import java.util.*;

public class Double_ended_Strings {

    static HashMap<String,Integer> hp;
    static int helper(String s1, String s2){
        if(s1.equals(s2)) return 0;
        if(s1.equals("")) return s2.length();
        if(s2.equals("")) return s1.length();

        if(hp.containsKey(s1+" "+s2)) return hp.get(s1+" "+s2);

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;
        int d = Integer.MAX_VALUE;

        if(s1.length()>=1) a = helper(s1.substring(1),s2);
        if(s1.length()>=1) b = helper(s1.substring(0,s1.length()-1),s2);
        if(s2.length()>=1) c = helper(s1,s2.substring(1));
        if(s2.length()>=1) d = helper(s1,s2.substring(0,s2.length()-1));

        int ans = 1+Math.min(a,Math.min(b,Math.min(c,d)));
        hp.put(s1+" "+s2,ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            hp = new HashMap<>();
            String s1 = sc.next();
            String s2 = sc.next();
            int ans = helper(s1,s2);
            System.out.println(ans);
            t--;
        }
    }
}
