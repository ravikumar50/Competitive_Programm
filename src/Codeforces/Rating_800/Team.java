package Codeforces.Rating_800;

import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;

        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<3; j++){
                count+=sc.nextInt();
            }
            if(count>=2) ans++;
        }
        System.out.println(ans);
    }
}
