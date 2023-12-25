package Codeforces.Rating_900;

import java.util.Scanner;

public class Make_Ap_1624B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            double a = sc.nextInt();
            double b = sc.nextInt();
            double c = sc.nextInt();

            double d1 = b-a;
            double d2 = c-b;
            double d3 = (c-a)/2.0;

            if((b+d1)%c==0 && (b+d1)>0){
                System.out.println("YES");
            }else if((b-d2)%a==0 && (b-d2)>0){
                System.out.println("YES");
            }else if((a+d3)%b==0 && (a+d3)>0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
}

// 2 6 3
