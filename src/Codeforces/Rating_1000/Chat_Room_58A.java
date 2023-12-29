package Codeforces.Rating_1000;

import java.util.Scanner;

public class Chat_Room_58A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String target = "hello";
        int j = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==target.charAt(j)) j++;
            if(j==target.length()){
                System.out.println("YES");
                return;
            }
        }

        if(j==target.length()) System.out.println("YES");
        else System.out.println("NO");
    }
}
