package CodeChef.Contest.Starter_118;
import java.util.*;
public class Subset_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long x = n/k;
            long ans = x;
            while(k>0){
                System.out.print(ans+" ");
                ans+=x;
                k--;
            }
            System.out.println();

            t--;
        }

    }
}
