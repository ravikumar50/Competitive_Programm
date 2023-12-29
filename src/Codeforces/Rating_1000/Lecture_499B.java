package Codeforces.Rating_1000;

import java.util.HashMap;
import java.util.Scanner;

public class Lecture_499B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<String,String> hp = new HashMap<>();

        for(int i=0; i<m; i++){
            String s1 = sc.next();
            String s2 = sc.next();
            hp.put(s1,s2);
        }

        StringBuilder ans = new StringBuilder();
        for(int i=0; i<n; i++){
            String a = sc.next();
            String b = hp.get(a);
            if(a.length()<=b.length()){
                ans.append(a);
            }else{
                ans.append(b);
            }
            if(i!=n-1) ans.append(" ");
        }
        System.out.println(ans);
    }
}
