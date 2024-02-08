package Codeforces.Contest.Codeforces_Round_923_Div3;
import java.util.*;
public class C_Choose_the_Different_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[m];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            Set<Integer> s1 = new HashSet<>();
            Set<Integer> s2 = new HashSet<>();

            for (int i = 0; i < n; i++) {
                if (a[i] <= k) {
                    s1.add(a[i]);
                }
            }

            for (int j = 0; j < m; j++) {
                if (b[j] <= k) {
                    s2.add(b[j]);
                }
            }

            if (s1.size() < k / 2 || s2.size() < k / 2) {
                System.out.println("NO");
            } else {
                boolean f = true;
                Set<Integer> s = new HashSet<>();

                for (int it : s1) {
                    s.add(it);
                }

                for (int it : s2) {
                    s.add(it);
                }

                for (int i = 1; i <= k; i++) {
                    if (!s.contains(i)) {
                        f = false;
                        break;
                    }
                }

                if (f) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
