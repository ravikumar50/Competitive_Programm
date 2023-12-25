package LeetCode;

public class Practice {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        b = a+b;
        a = b-a;
        b = b-a;

        System.out.println(a+" "+b);
    }
}
