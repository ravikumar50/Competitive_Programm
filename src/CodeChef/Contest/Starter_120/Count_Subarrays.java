package CodeChef.Contest.Starter_120;
import java.util.*;
import java.lang.*;
import java.io.*;

class Count_Subarrays
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Vector<Integer> arr = new Vector<>(n);
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }
            Vector<Integer> ans = new Vector<>(n + 1);
            for (int i = 0; i <= n; i++) {
                ans.add(1);
            }

            int sum = arr.get(0);
            int s = 0;
            for (int i = 1; i < n; i++) {
                sum += arr.get(i);
                while (sum > n) {
                    sum -= arr.get(s++);
                }
                int temp = s;
                int c = sum;
                while (i - temp != 0) {
                    ans.set(c, ans.get(c) + 1);
                    c -= arr.get(temp++);
                }
            }

            for (int i = 1; i <= n; i++) {
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
        }

    }
}
