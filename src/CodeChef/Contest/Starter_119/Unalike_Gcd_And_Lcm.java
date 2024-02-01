package CodeChef.Contest.Starter_119;
import java.util.*;
import java.lang.*;
import java.io.*;

// TLE

public class Unalike_Gcd_And_Lcm
{
    public static HashMap primeFactors(int n)
    {
        // Print the number of 2s that divide n
        HashMap<Integer,Integer> hp = new HashMap<>();
        while (n%2==0)
        {
            hp.put(2,hp.getOrDefault(2,0)+1);
            n /= 2;
        }

        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
                hp.put(i,hp.getOrDefault(i,0)+1);
                n /= i;
            }
        }

        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (n > 2) hp.put(n,hp.getOrDefault(n,0)+1);
        return hp;
    }

    static int helper(int x, int p){
        HashMap<Integer,Integer> hp = primeFactors(x);
        int count = 0;
        for(var a : hp.values()){
            if(p!=1){
                if(a%p==0) count++;
            }
        }
        return (int)Math.pow(2,count);
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int x = sc.nextInt();
            int q = sc.nextInt();
            for(int i=0; i<q; i++){
                int p = sc.nextInt();
                System.out.println(helper(x,p));
            }
            t--;
        }

    }
}
