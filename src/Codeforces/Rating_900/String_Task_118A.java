package Codeforces.Rating_900;

import java.util.Scanner;

public class String_Task_118A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder(sc.next().toLowerCase());

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='y'){
                s.deleteCharAt(i);
                i--;
            }
        }
        for(int i=0; i<s.length(); i=i+2){
            s.insert(i,'.');
        }
        System.out.println(s);
    }
}
