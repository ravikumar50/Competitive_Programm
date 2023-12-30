package Codeforces.Rating_800;

import java.util.Scanner;

public class Simple_Design_1884A {

    static int digitSum(int x){
        int sum = 0;

        while(x!=0){
            sum+=x%10;
            x=x/10;
        }
        return sum;
    }
    static int helper(int x, int k){

        while(digitSum(x)%k!=0){
            x++;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int x = sc.nextInt();
            int k = sc.nextInt();

            int ans = helper(x,k);
            System.out.println(ans);
            t--;
        }
    }
}
