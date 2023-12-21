package LeetCode.Daily_Problems;

import java.util.*;

/*
Given n points on a 2D plane where points[i] = [xi, yi], Return the widest vertical area between two points such that no points are inside the area.

A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height). The widest vertical area is the one with the maximum width.

Note that points on the edge of a vertical area are not considered included in the area.
 */
public class Widest_Verticle_Area_Between_Two_Points_1637 {
    public static int maxWidthOfVerticalArea(int[][] arr) {

        Arrays.sort(arr,(a,b)->(a[0]-b[0]));

        int ans = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i=1; i<n; i++){
            ans = Math.max(ans,arr[i][0]-arr[i-1][0]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = {{8,7},{9,9},{7,4},{9,7}};

        System.out.println(maxWidthOfVerticalArea(arr));
    }
}
