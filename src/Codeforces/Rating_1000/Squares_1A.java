package Codeforces.Rating_1000;

import java.util.Scanner;

public class Squares_1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();

        if(n%a==0 && m%a==0){
            System.out.println((n*m)/(a*a));
        }else if(n%a==0){
            System.out.println((n/a)*((m/a)+1));
        }else if(m%a==0){
            System.out.println((m/a)*((n/a)+1));
        }else{
            long x = n/a;
            long y = m/a;
            System.out.println((x*y)+(x+y+1));
        }
    }
}
