package CodeChef.Contest.Starter_121_DIV2;
import java.util.*;
import java.lang.*;
import java.io.*;

class Frequal
{

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    static ArrayList<Integer> helper(){

        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        int count = 1;
        int number = 3;

        while (count < 20005) {
            if (isPrime(number)) {
                primes.add(number);
                count++;
            }
            number += 2;
        }



        return primes;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> arr = helper();

        while(t>0){
            int n = sc.nextInt();
            int ans[] = new int[n];
            int idx = 0;
            if(n%2==0){
                for(int i=0; i<n; i=i+2){
                    ans[i] = arr.get(idx);
                    ans[i+1] = arr.get(idx);
                    idx++;
                }
            }else{
                ans[0] = 1;
                for(int i=1; i<n; i=i+2){
                    ans[i] = arr.get(idx);
                    ans[i+1] = arr.get(idx);
                    idx++;
                }
            }

            for(int i=0; i<n; i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
            t--;
        }

    }
}
