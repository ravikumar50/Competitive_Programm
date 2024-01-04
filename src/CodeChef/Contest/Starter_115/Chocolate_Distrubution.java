package CodeChef.Contest.Starter_115;

import java.util.*;
public class Chocolate_Distrubution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int a = (int)Math.ceil(n/2.0);
            System.out.println(a+" "+n);
            t--;
        }
    }
}
