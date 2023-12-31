package Codeforces.Rating_1000;

import java.util.HashSet;
import java.util.Scanner;

public class Distinct_Split_1791D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            String s = sc.next();

            int pre[] = new int[n];
            int suff[] = new int[n];

            HashSet<Character> hp = new HashSet<>();
            pre[0] = 1;
            suff[n-1] = 1;
            hp.add(s.charAt(0));

            for(int i=1; i<n; i++){
                hp.add(s.charAt(i));
                pre[i] = hp.size();
            }

            hp.clear();
            hp.add(s.charAt(n-1));
            for(int i=n-2; i>=0; i--){
                hp.add(s.charAt(i));
                suff[i] = hp.size();
            }
            int ans = 0;

            for(int i=1; i<n; i++){
                ans = Math.max(ans,pre[i-1]+suff[i]);
            }
            System.out.println(ans);
            t--;
        }
    }
}
