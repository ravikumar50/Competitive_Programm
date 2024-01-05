package Atcoder;

public class Practice {
    static int helper(int n){
        if(n==1) return 2;
        if(n==2) return 3;

        int a = helper(n-2);
        int b = helper(n-1);
        return a+b;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(helper(n));
    }
}
