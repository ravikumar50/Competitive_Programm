package Codeforces.Rating_900;

import java.util.Scanner;

public class Game_With_Stick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n > m) {

            // swap
            int a = n;
            n = m;
            m = a;
        }
        if (n % 2 == 0) {
            System.out.println("Malvika");
        } else {
            System.out.println("Akshat");
        }
    }
}
