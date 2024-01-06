package Codeforces.Contest.Hello_2024;

import java.util.*;
public class A_Wallet_Exchange {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if ((a + b) % 2 != 0) System.out.println("Alice");
            else System.out.println("Bob");
            t--;
        }
    }
}