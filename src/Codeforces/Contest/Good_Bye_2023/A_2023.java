package Codeforces.Contest.Good_Bye_2023;
import java.util.Scanner;

public class A_2023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            long n = sc.nextLong();
            long prod = 1;
            long b = sc.nextLong();

            for(int i=0; i<n; i++){
                prod*=sc.nextLong();
            }
            if(2023%prod!=0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
                long x = 2023/prod;
                System.out.print(x+" ");
                for(int i=1; i<b; i++){
                    System.out.print(1);
                    if(i!=b-1) System.out.print(" ");
                }
                System.out.println();
            }

            t--;

        }

    }
}
