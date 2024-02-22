package Codeforces.Codeforces_Round_928_DIV4;
// Java program to implement Best First Search using priority
// qu
import java.util.*;

public class Vlad_and_a_Sum_of_Sum_of_Digits_C
{
    static int d[];
    static int sumD(int n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
    // Driver code to test above methods
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        d = new int[200005];

        for (int i = 0; i < 200001; i++) {
            d[i + 1] = sumD(i + 1) + d[i];
        }

        int t = sc.nextInt();

        while (t>0) {
            int n = sc.nextInt();
            System.out.println(d[n]);
            t--;
        }

    }
}
