package Codeforces.Rating_900;

import java.util.Scanner;

public class Kana_And_Dragon_Quest_Game_1337B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int x = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            while(n>0 && x/2+10<x){
                n--;
                x = x/2+10;
            }
            if(x<=10*m){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }

    }
}
