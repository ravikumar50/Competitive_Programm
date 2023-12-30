package Codeforces.Rating_1000;

import java.util.Scanner;

public class Board_Moves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            long n = sc.nextLong();
            long ans = (n*(n-1)*(n+1))/3;
            System.out.println(ans);
            t--;
        }
    }
}
