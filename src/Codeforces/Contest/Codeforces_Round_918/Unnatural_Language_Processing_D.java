package Codeforces.Contest.Codeforces_Round_918;

import java.util.Scanner;

public class Unnatural_Language_Processing_D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            StringBuilder s = new StringBuilder(sc.next());

            int i = s.length()-1;
            while(i>2){
                char ch = s.charAt(i);
                if(ch=='a' || ch=='e'){
                    s.insert(i-1,".");
                    i=i-2;
                }else{
                    s.insert(i-2,".");
                    i=i-3;
                }
            }
            System.out.println(s);
            t--;
        }
    }
}
