package Codeforces.Rating_1000;


import java.util.ArrayList;
import java.util.Scanner;

/*
 It's easy to see that we can't get the result less than 2, because, if we merge two positive numbers, and at
 least one of them is 2 or greater, the new number is always greater than 1.So we can't get rid of all numbers greater than 1.
 To always achieve 2, we can use a greedy algorithm: always merge two maximum numbers. During the first step, we merge
 nand n−1, get n; then we merge n and n−2, get n−1; then we merge n−1 and n−3, get n−2; and it's easy to see that the last operation is merging 3
 and 1, so the result is 2.
 */
public class Numbers_on_Whiteboard_1430C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=1; i<=n; i++) arr.add(i);
            System.out.println(2);

            while(arr.size()!=1){
                int x = arr.size();
                int a = arr.get(x-1);
                int b = arr.get(x-2);
                System.out.println(a+" "+b);
                arr.remove(arr.size()-1);
                arr.remove(arr.size()-1);
                arr.add((int)Math.ceil((a+b)/2.0));
            }
            t--;

        }
    }
}
