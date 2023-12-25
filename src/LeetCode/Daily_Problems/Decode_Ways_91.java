package LeetCode.Daily_Problems;

import java.util.*;
public class Decode_Ways_91 {

        static int dp[];
        static int helper(String s, int i){
            if(i>=s.length()) return 1;
            if(i==s.length()-1){
                if(s.charAt(i)!='0') return 1;
                else return 0;
            }

            if(dp[i]!=-1) return dp[i];

            int a = 0;
            int b = 0;
            int x = Integer.valueOf(s.substring(i,i+2));
            if(s.charAt(i)!='0') a = helper(s,i+1);
            if(x>=10 && x<=26) b = helper(s,i+2);

            return dp[i] = a+b;
        }
        public int numDecodings(String s) {
            dp = new int[105];
            Arrays.fill(dp,-1);
            return helper(s,0);
        }
    public static void main(String[] args) {
        dp = new int[105];
        Arrays.fill(dp,-1);
        String s = "221";

    }
}
