package Codeforces.Rating_1100;

import java.util.Scanner;

public class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            if(x==1) a++;
            else if(x==2) b++;
            else if(x==3) c++;
            else d++;
        }
        int ans = 0;
        ans = ans+d;
        if(c>=a){
            ans = ans+c;
            ans+=b/2;
            ans = ans+b%2;
        }else{
            ans = ans+c;
            a=a-c;
            ans = ans+b/2;
            int r = b%2;
            a = a+(2*r);
            ans = ans+((a%4==0)?a/4 :(a/4)+1);
        }
        System.out.println(ans);

    }
}
