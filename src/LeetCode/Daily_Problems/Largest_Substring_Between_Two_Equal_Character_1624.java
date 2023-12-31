package LeetCode.Daily_Problems;
import java.util.*;
public class Largest_Substring_Between_Two_Equal_Character_1624 {
    public static int maxLengthBetweenEqualCharacters(String s) {
        int arr1[] = new int[26];
        int arr2[] = new int[26];

        Arrays.fill(arr1,-1);
        Arrays.fill(arr2,-1);
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(arr1[ch-97]==-1) arr1[ch-97] = i;   // first index
            arr2[ch-97] = Math.max(arr2[ch-97],i);  // last index
        }

        int ans = -1;
        for(int i=0; i<26; i++){
            ans = Math.max(ans,arr2[i]-arr1[i]-1);
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abca";
        int ans = maxLengthBetweenEqualCharacters(s);
        System.out.println(ans);
    }
}
