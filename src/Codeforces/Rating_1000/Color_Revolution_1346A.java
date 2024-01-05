package Codeforces.Rating_1000;

import java.util.Scanner;

public class Color_Revolution_1346A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int n1 = n/(1+k+k*k+k*k*k);
            int n2 = k*n1;
            int n3 = k*n2;
            int n4 = k*n3;
            System.out.println(n1+" "+n2+" "+n3+" "+n4);
            t--;
        }
    }
}
