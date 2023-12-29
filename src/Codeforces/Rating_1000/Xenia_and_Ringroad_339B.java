package Codeforces.Rating_1000;

import java.util.Scanner;

public class Xenia_and_Ringroad_339B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long arr[] = new long[m];
        for(int i=0; i<m; i++) {
            arr[i] = sc.nextInt();
        }

        long ans = 0;
        long start = 1;
        for(int i=0; i<m; i++){
            if(arr[i]!=start){
                if(start<arr[i]) ans = ans+(arr[i]-start);
                else{
                    ans = ans + (n-start)+arr[i];
                }

                start = arr[i];
            }
        }
        System.out.println(ans);
    }
}
