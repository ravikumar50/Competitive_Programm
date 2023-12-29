package Codeforces.Contest.Codeforces_Round_918;

import java.util.Scanner;

public class Can_I_Square_C {

    static boolean helper(long sum){

        long st = 1;
        long end = 200000;
        while(st<=end){
            long mid = st+(end-st)/2;
            long sq = mid*mid;
            if(sq==sum){
                return true;
            }else if(sq>sum){
                end = mid-1;
            }else st = mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            long sum = 0;
            for(int i=0; i<n; i++){
                sum += sc.nextLong();
            }
            boolean ans = helper(sum);

            if(ans==true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
