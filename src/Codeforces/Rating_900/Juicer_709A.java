package Codeforces.Rating_900;

import java.util.Scanner;

public class Juicer_709A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int currWaste = 0;
        int ans = 0;
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            if(a<=c){
                if(currWaste+a<=d){
                    currWaste += a;
                }else{
                    ans++;
                    currWaste = 0;
                }
            }
        }
        System.out.println(ans);
    }
}
