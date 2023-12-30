package Codeforces.Rating_1000;

import java.util.Scanner;

public class Petr_and_Book_139A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[7];
        for(int i=0; i<7; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int idx = -1;
        while(sum<n){
            if(idx==6) idx = 0;
            else idx++;
            sum+=arr[idx];
        }
        System.out.println(idx+1);
    }
}
