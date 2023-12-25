package Codeforces.Rating_900;

import java.util.Scanner;

public class Food_Buying_1296B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int s = sc.nextInt();
            int ans = 0;

            while(s>9){
                int a = s/10;
                s = s-(10*a);
                s = s+a;
                ans = ans + 10*a;
            }
            System.out.println(ans+s);
            t--;
        }
    }
}
