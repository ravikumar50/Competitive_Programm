package Codeforces.Rating_1000;

import java.util.Scanner;

public class Room_Leader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int ans = Integer.MIN_VALUE;
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String s = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();
            int f = sc.nextInt();
            int g = sc.nextInt();
            int x = a*100-b*50+c+d+e+f+g;
            if(ans<x){
                ans = x;
                name = s;
            }
        }
        System.out.println(name);
    }
}
