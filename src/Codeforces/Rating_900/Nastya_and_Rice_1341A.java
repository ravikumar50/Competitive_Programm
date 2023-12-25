package Codeforces.Rating_900;

import java.util.Scanner;

public class Nastya_and_Rice_1341A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int st = a-b;
            int end = a+b;
            int stRange = c-d;
            int endRange = c+d;

            if(n*st>endRange || n*end<stRange) System.out.println("NO");
            else System.out.println("YES");
            t--;
        }
    }
}
