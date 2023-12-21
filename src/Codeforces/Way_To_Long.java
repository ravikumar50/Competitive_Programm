package Codeforces;

import java.util.*;
public class Way_To_Long {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            StringBuilder s = new StringBuilder(sc.next());
            int x = s.length();
            if(x>10){
                System.out.println(s.charAt(0)+String.valueOf(x-2)+s.charAt(x-1));
            }else{
                System.out.println(s);
            }

        }
    }
}
