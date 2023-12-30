package Codeforces.Rating_1000;

import java.util.Scanner;

public class k_String_219A {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        int arr[] = new int[26];

        for(var a : s.toCharArray()) arr[a-97]++;
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<26; i++){
            if(arr[i]%k!=0){
                System.out.println(-1);
                return;
            }else{
                int x = arr[i]/k;
                String str = String.valueOf((char)(i+97));
                ans.append(str.repeat(x));
            }
        }

        String x = ans.append(ans.toString().repeat(k-1)).toString();
        System.out.println(x);
    }
}
