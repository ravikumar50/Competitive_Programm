package Codeforces.Rating_800;

import java.util.*;
public class Two_Arrays_And_Swap_1353B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t>0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            int sum = 0;

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            for(int i=0; i<n; i++) b[i] = sc.nextInt();

            Arrays.sort(a);
            Arrays.sort(b);
            int i = 0;
            int j = n-1;
            while (k>0){
                if(a[i]<b[j]){
                    sum = sum-a[i++]+b[j--];
                }
                k--;
            }

            System.out.println(sum);
            t--;
        }
    }
}
