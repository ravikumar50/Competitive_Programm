package Codeforces.Rating_900;


import java.util.Scanner;


public class Valera_And_Plates_369A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            if(a==1){
                if(m<=0) ans++;
                else m--;
            }else{
                if(k<=0){
                    if(m<=0) ans++;
                    else m--;
                }else k--;
            }
        }
        System.out.println(ans);
    }
}
