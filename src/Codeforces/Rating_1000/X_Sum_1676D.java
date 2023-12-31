package Codeforces.Rating_1000;

import java.util.Scanner;

public class X_Sum_1676D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            long arr[][] = new long[n][m];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    arr[i][j] = sc.nextLong();
                }
            }

            long ans = 0;

            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    int a = i-1;
                    int b = j-1;
                    long sum = 0;
                    while(a>=0 && b>=0){
                        sum+=arr[a][b];
                        a--;
                        b--;
                    }
                    a=i+1;
                    b=j+1;
                    while(a<n && b<m){
                        sum+=arr[a][b];
                        a++;
                        b++;
                    }
                    a=i-1;
                    b=j+1;
                    while(a>=0 && b<m){
                        sum+=arr[a][b];
                        a--;
                        b++;
                    }
                    a=i+1;
                    b=j-1;
                    while(a<n && b>=0){
                        sum+=arr[a][b];
                        a++;
                        b--;
                    }
                    sum+=arr[i][j];
                    ans = Math.max(ans,sum);
                }
            }
            System.out.println(ans);
            t--;
        }
    }
}
