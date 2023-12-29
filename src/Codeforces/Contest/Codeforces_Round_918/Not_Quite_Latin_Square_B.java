package Codeforces.Contest.Codeforces_Round_918;

import java.util.Scanner;

public class Not_Quite_Latin_Square_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int a=0,b=0,c=0;
            for(int i=0; i<3; i++){
                String s = sc.next();
                for(int j=0; j<3; j++){
                    char ch = s.charAt(j);
                    if(ch=='A') a++;
                    else if(ch=='B') b++;
                    else if(ch=='C') c++;
                }

            }
            if(a!=3){
                System.out.println('A');
            }else if(b!=3){
                System.out.println('B');
            }else{
                System.out.println('C');
            }
            t--;
        }
    }
}
