package Codeforces.Rating_900;

import java.util.Arrays;
import java.util.Scanner;

public class Squares_263B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if(k>n){
            System.out.println(-1);
        }else if(k==n){
            System.out.println(0+" "+0);
        }else{
            Integer arr[] = new Integer[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr,(a,b)->(b-a));
            int a = arr[k];
            int b = arr[k-1];
            int x = (int)Math.ceil((a+b)/2.0);
            System.out.println(x+" "+x);
        }
    }
}
