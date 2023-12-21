package Codeforces.Rating_900;

import java.util.*;

public class Even_Odd_318A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long n1 = (long)Math.ceil(n/(2*1.0));
        if(k<=n1){
            System.out.println(2*k-1);
        }else{
            k = k-n1;
            System.out.println(2*k);
        }
    }
}
// 1000000000000 500000000001