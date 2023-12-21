package Codeforces.Rating_800;

import java.util.Scanner;

public class Pen_And_Pencils_1244A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int k = sc.nextInt();

            int x = (int)Math.ceil(a/(c*1.0));
            int y = (int)Math.ceil(b/(d*1.0));

            if(x+y<=k){
                System.out.println(x+" "+y);
            }else System.out.println(-1);

            t--;

        }
    }
}
