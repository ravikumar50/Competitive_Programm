package Codeforces.Contest.Hello_2024;

import java.util.*;
public class Plus_Minus_Split {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int a = 0;
            int b = 0;
            int n = sc.nextInt();
            String s = sc.next();
            for(int i=0; i<n; i++){
                if(s.charAt(i)=='+') a++;
                else b++;
            }

            System.out.println(Math.abs(a-b));
            t--;
        }
    }
}
