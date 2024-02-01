package CodeChef.Contest.Starter_119;

import java.util.Scanner;

class Cookie_Day {
    public static void main(String[] args) throws Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a >= k) {
                    ans = Math.min(ans, a % k);
                }
            }
            if (ans == Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(ans);
            }

            t--;
        }

    }
}

