package Codeforces.Rating_800;

import java.util.*;
public class WaterMelon_4A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();

        if(w%2==0 && w>2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
