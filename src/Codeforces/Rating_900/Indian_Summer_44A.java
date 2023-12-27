package Codeforces.Rating_900;

import java.util.HashSet;
import java.util.Scanner;

public class Indian_Summer_44A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        HashSet<String> hp = new HashSet<>();
        for(int i=0; i<n; i++){
            String s = sc.nextLine();
            if(!hp.contains(s)) hp.add(s);
        }

        System.out.println(hp.size());
    }
}
