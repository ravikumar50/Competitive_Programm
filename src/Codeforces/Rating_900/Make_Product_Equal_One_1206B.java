package Codeforces.Rating_900;

import java.util.Scanner;

public class Make_Product_Equal_One_1206B {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long negative = 0;
        long ans = 0;
        long zero = 0;

        for(int i=0; i<n; i++){
            long a = sc.nextInt();
            if(a==0) zero++;
            if(a<0) negative++;

            if(a>0) ans = ans+a-1;
            else if(a<0) ans = ans -(a+1);

        }

        if(negative%2!=0){
            if(zero!=0){
                ans++;
                zero--;
                ans+=zero;
            }else{
                ans=ans+2;
            }
        }else{
            ans = ans+zero;
        }
        System.out.println(ans);
    }
}
