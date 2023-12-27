package GFG.Daily_Problems;
import java.util.*;
public class Anti_Daigonal_Traversal {

    /*
    Give a n*n square matrix, return an array of its anti-diagonals in top-leftmost to
    bottom-rightmost order. In an element of a anti-diagonal (i, j), surrounding elements
    will be (i+1, j-1) and (i-1, j+1).
     */
    public static int[] antiDiagonalPattern(int[][] arr){
        // Code here
        int n = arr.length;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        int ans[] = new int[n*n];
        int idx = 0;

        while(q.size()!=0){
            int a[] = q.remove();
            int x = a[0];
            int y = a[1];

            ans[idx++] = arr[x][y];

            if(y+1<n && x==0) q.add(new int[]{x,y+1});
            if(x+1<n) q.add(new int[]{x+1,y});
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int ans[] = antiDiagonalPattern(arr);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
