package Codeforces.Rating_1000;

import java.util.Scanner;

public class Count_the_Number_of_Pairs_1800B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int arr1[] = new int[26];
            int arr2[] = new int[26];

            for(var ch : s.toCharArray()){
                if(ch>='a' && ch<='z') arr1[ch-'a']++;
                else arr2[ch-'A']++;
            }
            int ans = 0;
            for(int i=0; i<26; i++){
                int x = arr1[i];
                int y = arr2[i];
                ans = ans + Math.min(x,y);
                int diff = Math.abs(x-y);
                if(diff/2<=k){
                    ans = ans+(diff/2);
                    k = k-(diff/2);
                }else{
                    ans = ans + k;
                    k=0;
                }
            }
            System.out.println(ans);
            t--;
        }
    }
}
