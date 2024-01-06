package Codeforces.Contest.Good_Bye_2023;

import java.util.Scanner;

public class B_Two_Divisor {
    static long gcd(long a, long b){
        if(b==0) return a;
        else return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            long a = sc.nextInt();
            long b = sc.nextInt();

            if(b%a==0){
                System.out.println((b/a)*b);
            }else{
                long hcf = gcd(a,b);
                long ans = (a*b)/hcf;
                System.out.println(ans);
            }
            t--;
        }
    }
}
