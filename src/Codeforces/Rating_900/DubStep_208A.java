package Codeforces.Rating_900;

import java.util.Scanner;

public class DubStep_208A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean flag = true;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='W'&& s.charAt(i+1)=='U' && s.charAt(i+2)=='B'){
                i+=2;
                if(!flag){
                    System.out.print(" ");
                }
                continue;
            }else {
                flag=false;
                System.out.print(s.charAt(i));
            }
        }
    }
}
