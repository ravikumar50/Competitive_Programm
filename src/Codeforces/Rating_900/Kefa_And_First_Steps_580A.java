package Codeforces.Rating_900;

import java.util.Scanner;

public class Kefa_And_First_Steps_580A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int len = 0;
        int prev = -1;

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            if(a>=prev){
                len++;
                prev = a;
            }else {
                ans = Math.max(ans, len);
                len = 1;
                prev = a;
            }
        }
        System.out.println(Math.max(ans,len));
    }
}
