package Codeforces.Rating_800;
import java.util.*;
public class Police_Recruits_427A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int police = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == -1) {
                if (police > 0) {
                    police--;
                } else {
                    ans++;
                }
            } else {
                police += a;

            }
        }
        System.out.println(ans);
    }
}
