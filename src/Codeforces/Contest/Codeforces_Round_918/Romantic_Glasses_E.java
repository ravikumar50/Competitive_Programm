package Codeforces.Contest.Codeforces_Round_918;

import java.util.HashSet;
import java.util.Scanner;

public class Romantic_Glasses_E {

    static boolean helper(long arr[]){
        long sum = 0;
        HashSet<Long> hp = new HashSet<>();
        hp.add((long)0);
        for(int i=0; i<arr.length; i++){
            arr[i] *= (i%2!=0) ? -1 :  1;
            sum+=arr[i];
            if(hp.contains(sum)){
                return true;
            }else{
                hp.add(sum);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            boolean ans = helper(arr);
            if(ans==true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
