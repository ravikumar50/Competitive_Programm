package GFG.Daily_Problems;

import java.util.ArrayList;

public class Largest_rectangular_sub_matrix_whose_sum_is_0 {

    static int findSum(int arr[][], int x1, int y1, int x2, int y2){
        int n = arr.length;
        int m = arr.length;
        int a = (x1-1>=0) ? arr[x1-1][y2] : 0;
        int b = (y1-1>=0) ? arr[x2][y1-1] : 0;
        int c = (x1-1>=0 && y1-1>=0) ? arr[x1-1][y1-1] : 0;
        return arr[x2][y2]-a-b+c;
    }

    public static void main(String[] args) {
        int arr[][] = {{-3, 2, -2, 4, -3},
                {5, -2, 8, 3 ,-2},
                {9 ,1 ,-9, 2 ,8}};

        int n = arr.length;
        int m = arr[0].length;
        int pre[][] = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(j==0) pre[i][j] = arr[i][j];
                else pre[i][j] = pre[i][j-1] + arr[i][j];
            }
        }



        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++){
                if(i!=0) pre[i][j] = pre[i-1][j] + pre[i][j];
            }
        }

        int ansSize=0;
        int ansMatrix[] = new int[]{0,0,0,0};

        for(int x1=0; x1<n; x1++){
            for(int y1=0; y1<m; y1++){
                for(int x2=x1; x2<n; x2++){
                    for(int y2=y1; y2<m; y2++){
                        int sum = findSum(pre,x1,y1,x2,y2);

                        if(sum==0){
                            int size = (x2-x1+1)*(y2-y1+1);
                            if(size>ansSize){
                                ansSize = size;
                                ansMatrix = new int[]{x1,y1,x2,y2};
                            }else{
                                if(x2-x1>ansMatrix[2]-ansMatrix[0]){
                                    ansMatrix = new int[]{x1,y1,x2,y2};
                                }
                            }
                        }
                    }
                }
            }
        }

        int r1 = ansMatrix[0];
        int c1 = ansMatrix[1];
        int r2 = ansMatrix[2];
        int c2 = ansMatrix[3];

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=r1; i<=r2; i++){
            ArrayList<Integer> a = new ArrayList<>();
            for(int j=c1; j<=c2; j++){
                a.add(arr[i][j]);
            }
            ans.add(a);
        }
        for(int i=0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }
}
