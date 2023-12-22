package LeetCode.Daily_Problems;

/*
Given a string s of zeros and ones, return the maximum score after splitting the string into two
 non-empty substrings (i.e. left substring and right substring).

The score after splitting a string is the number of zeros in the left substring plus the number
 of ones in the right substring.
 */

public class Maximun_Score_After_Spliting_A_String_1422 {

    public static int maxScore(String s) {
        int n = s.length();
        int ones = 0;
        int zero = 0;

        for(int i=0; i<n; i++){
            if(s.charAt(i)=='0') zero++;
            else ones++;
        }

        int left = 0;
        int right = 0;
        int ans = 0;
        for(int i=0; i<n-1; i++){
            if(s.charAt(i)=='0'){
                left++;
                right = ones;
                ans = Math.max(ans,left+right);
            }else{
                ones--;
                right=ones;
                ans = Math.max(ans,left+right);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        String s = "011101";
        int ans = maxScore(s);
        System.out.println(ans);
    }
}
