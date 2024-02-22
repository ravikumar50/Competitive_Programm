
import java.util.*;
public class Main {

    static int l;

    static int helper(int n,int x, int num){
        if(check(Integer.toBinaryString(n),0,"")==false){
            return Math.abs(n-num);
        }
        System.out.println(Integer.toBinaryString(n).length());
        if(Integer.toBinaryString(n).length()>l) return Integer.MAX_VALUE;

        int a = helper(n+(int)Math.pow(2,x),x+1,num);
        int b = helper(n,x+1,num);

        return Math.min(a,b);
    }

    static boolean check(String s, int idx, String curr){
        if(curr.equals("101")) return true;
        if(idx>=s.length()) return false;

        return check(s,idx+1,curr+s.charAt(idx)) || check(s,idx+1,curr);
    }


    // Helper function to compute the KMP prefix ar
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            l = Integer.toBinaryString(n).length();
            System.out.println(l);
            System.out.println(helper(n,1,n));


            t--;
        }

    }
}
