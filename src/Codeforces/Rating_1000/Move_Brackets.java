package Codeforces.Rating_1000;

import java.util.Scanner;
import java.util.Stack;

public class Move_Brackets {
    static void helper(String s){
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int ans = 0;
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch=='(') st.push(ch);
            else{
                if(st.size()==0) ans++;
                else if(st.peek()=='(') st.pop();
            }
        }

        ans = ans+st.size();
        System.out.println(ans/2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            String s = sc.next();
            helper(s);
            t--;
        }



    }
}
