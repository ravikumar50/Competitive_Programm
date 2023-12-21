package Codeforces.Rating_800;

import java.util.Scanner;

public class Sum_In_Binary_Tree_1843C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();
        while(t>0){
            long ans = 0;
            long n = sc.nextLong();
            while(n!=0){
                ans += n;
                n = n/2;
            }
            System.out.println(ans);
            t--;
        }

    }
}
