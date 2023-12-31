package Codeforces.Rating_1000;

import java.util.Scanner;

public class Sum_of_Digits_102B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int ans = 0;
        while(x.length()!=1){
            int num = 0;
            StringBuilder s = new StringBuilder(x);
            while(s.length()!=0){
                num += Integer.valueOf(s.charAt(0)-48);
                s.deleteCharAt(0);
            }
            x = String.valueOf(num);
            ans++;
        }
        System.out.println(ans);
    }
}
