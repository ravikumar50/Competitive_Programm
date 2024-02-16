package CodeChef.Contest;
import java.util.*;
import java.lang.*;
import java.io.*;

class Anti_Adjacent_Swaps
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int size = scanner.nextInt();
            int[] arr = new int[size];
            for (int index = 0; index < size; index++) {
                arr[index] = scanner.nextInt();
            }
            if (size == 2) {
                if (arr[0] > arr[1]) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
                continue;
            }
            if (size == 3) {
                if (arr[1] < Math.min(arr[2], arr[0]) || arr[1] > Math.max(arr[2], arr[0])) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
                continue;
            }
            System.out.println("YES");
        }

    }
}
