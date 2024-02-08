package Codeforces.Contest.Codeforces_Round_923_Div3;
import java.util.*;
public class D_Find_the_Different_Ones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt = 1;
        tt = sc.nextInt();
        while (tt-- > 0) {
            int n, q;
            n = sc.nextInt();
            int[] a = new int[n];
            int[] nott = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            nott[n - 1] = n;
            for (int i = n - 2; i >= 0; i--) {
                nott[i] = (a[i] == a[i + 1] ? nott[i + 1] : i + 1);
            }

            q = sc.nextInt();
            while (q-- > 0) {
                int l, r;
                l = sc.nextInt();
                r = sc.nextInt();
                --l;
                --r;
                if (nott[l] > r) {
                    System.out.println(-1 + " " + -1);
                } else {
                    System.out.println((l + 1) + " " + (1 + nott[l]));
                }
            }
        }
    }
}
