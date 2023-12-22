package Codeforces.Rating_900;

import java.util.Scanner;

public class Strips_1742C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            for(int i=0; i<8; i++){
                int r = 0;
                for(int j=0; j<8; j++){
                    char ch = sc.next().charAt(0);
                    if(ch=='R') r++;
                }
                if(r==8){
                    System.out.println("R");
                    t--;
                    return;
                }
            }
            System.out.println("B");
            t--;
        }
    }
}
