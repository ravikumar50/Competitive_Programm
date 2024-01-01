package LeetCode.Daily_Problems;
import java.util.*;
public class Assign_Cookies_455 {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int i = 0;

        for(int j=0; i<g.length && j<s.length; j++){
            if(g[i]<=s[j]) i++;
        }
        return i;
    }
    public static void main(String[] args) {
        int s[] = {1,2,3};
        int g[] = {1,2};
        int ans = findContentChildren(g,s);
        System.out.println(ans);
    }
}
