package GFG.Daily_Problems;

public class Determinant_Of_A_Matrix {
    static int helper(int arr[][], int n){
        if(n==1) return arr[0][0];
        if(n==2){
            return (arr[0][0]*arr[1][1])-(arr[0][1]*arr[1][0]);
        }

        int ans = 0;

        for(int i=0; i<n; i++){
            ans = ans + arr[0][i]*cofactor(arr,0,i,n-1)*(int)Math.pow(-1,i);
        }
        return ans;
    }

    static int cofactor(int arr[][], int row, int col, int n){
        int subMat[][] = new int[n][n];

        int nr = 0;
        int nc = 0;

        for(int i=0; i<n+1; i++){
            for(int j=0; j<n+1; j++){
                if(i!=row && j!=col){
                    subMat[nr][nc++] = arr[i][j];

                    if(nc==n){
                        nr++;
                        nc=0;
                    }
                }
            }
        }
        return helper(subMat,n);
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 0, 2, -1},
                {3, 0, 0, 5},
                {2, 1, 4, -3},
                {1, 0, 5, 0}};
        int ans = helper(arr,arr.length);

        System.out.println(ans);
    }
}
