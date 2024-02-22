package Codeforces.Codeforces_Round_928_DIV4;

import java.util.Scanner;

public class Vlad_and_an_Odd_Ordering_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();

        for (int t = 0; t < test; t++) {
            String[] inputs = sc.nextLine().split(" ");
            int n = Integer.parseInt(inputs[0]);
            int k = Integer.parseInt(inputs[1]);
            int idx = 1;

            while (true) {
                int curr = n / 2 + (n % 2);
                if (curr >= k) {
                    System.out.println((2 * k - 1) * idx);
                    break;
                } else {
                    k -= curr;
                    idx *= 2;
                    n /= 2;
                }
            }
        }

    }
}