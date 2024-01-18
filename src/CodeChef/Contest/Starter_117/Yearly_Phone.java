package CodeChef.Contest.Starter_117;

import java.util.*;

public class Yearly_Phone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = String.valueOf(a);
        int n = s.length();
        String ans = "K"+s.substring(n-2,n);
        System.out.println(ans);

    }
}
