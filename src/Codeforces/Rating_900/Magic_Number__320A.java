package Codeforces.Rating_900;

import java.util.Scanner;

public class Magic_Number__320A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if(s.charAt(0)!='1' || s.contains("444")){
            System.out.println("NO");
            return;
        }else{
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)!='1' && s.charAt(i)!='4'){
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
}
