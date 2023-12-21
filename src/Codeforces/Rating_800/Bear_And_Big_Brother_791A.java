package Codeforces.Rating_800;

import java.util.*;
public class Bear_And_Big_Brother_791A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 0;
        while(a<=b){
            a = 3*a;
            b = 2*b;
            ans++;
        }
        System.out.println(ans);
    }
}
