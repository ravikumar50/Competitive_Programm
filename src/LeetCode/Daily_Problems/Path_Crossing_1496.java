package LeetCode.Daily_Problems;

import java.util.*;
public class Path_Crossing_1496 {
    // leetcode 1
    public static boolean isPathCrossing(String s) {
        HashSet<String> hp = new HashSet<>();
        int n = s.length();
        int x = 0;
        int y = 0;
        hp.add("0,0");

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='N'){
                y++;
            }else if(ch=='S'){
                y--;
            }else if(ch=='E'){
                x++;
            }else{
                x--;
            }

            if(hp.contains(x+","+y)) return true;
            else hp.add(x+","+y);
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "NESWW";

        System.out.println(isPathCrossing(s));

    }
}
