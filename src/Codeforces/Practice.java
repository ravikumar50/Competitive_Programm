package Codeforces;

import java.util.*;
public class Practice {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String s = sc.nextLine();
            String arr[] = s.split(" ");
            System.out.println(arr[1]);
        }
    }
}
