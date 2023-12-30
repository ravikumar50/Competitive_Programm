package Codeforces.Rating_1000;

import java.util.Scanner;

public class Black_and_White_Stripe_1690D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int preW[] = new int[n];
            if(s.charAt(0)=='W') preW[0] = 1;

            for(int i=1; i<n; i++){
                char ch = s.charAt(i);
                if(ch=='B'){
                    preW[i] = preW[i-1];
                }else{
                    preW[i] = 1+preW[i-1];
                }
            }

            int ans = preW[k-1];
            int i=1,j=k;
            while(j<n){
                int x = preW[j]-preW[i-1];
                ans = Math.min(ans,x);
                i++;
                j++;
            }
            System.out.println(ans);
            t--;
        }
    }
}
