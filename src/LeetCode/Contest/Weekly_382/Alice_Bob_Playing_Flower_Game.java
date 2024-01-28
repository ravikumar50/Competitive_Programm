package LeetCode.Contest.Weekly_382;

public class Alice_Bob_Playing_Flower_Game {
    public static long flowerGame(int n, int m) {


        long o1 = (long)Math.ceil(n/2.0);
        long o2 = (long)Math.ceil(m/2.0);

        long e1 = (long)n/2;
        long e2 = (long)m/2;

        long ans = (o1*e2)+(o2*e1);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(flowerGame(3,2));
    }
}
