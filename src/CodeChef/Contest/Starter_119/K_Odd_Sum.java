package CodeChef.Contest.Starter_119;
import java.util.*;
import java.lang.*;
import java.io.*;

public gclass K_Odd_Sum
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=1; i<=k+1; i++){
                arr.add(i);
            }

            int x = n-k-1;
            int curr = k+2;
            int odd = 0;
            int even = 1;
            while(x>0){
                if(curr%2==0){
                    arr.add(even+1,curr);
                    curr++;
                }else{
                    arr.add(odd+1,curr);
                    even++;
                    curr++;
                }
                x--;
            }

            for(int i=0; i<arr.size(); i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
            t--;

        }

    }
}
