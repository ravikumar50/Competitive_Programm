package Codeforces.Contest.Codeforces_Round_923_Div3;

import java.util.Scanner;

public class A_Make_it_White {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            String s = sc.next();

            int a = s.indexOf('B');
            int b = s.lastIndexOf('B');
            // System.out.println(a+" "+b);
            if(a==-1 || b==-1){
                System.out.println(0);
            }else if(a==b){
                System.out.println(1);
            }else{
                System.out.println(b-a+1);
            }
            t--;
        }
    }
}