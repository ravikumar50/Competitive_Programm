package Codeforces.Rating_1000;

import java.util.ArrayList;
import java.util.Scanner;


public class Jzzhu_and_Children_450A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<int[]> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            arr.add(new int[]{sc.nextInt(),i+1});
        }

        while(arr.size()!=1){
            int a[] = arr.remove(0);
            if(a[0]<=m) continue;
            else{
                arr.add(new int[]{a[0]-m,a[1]});
            }
        }
        System.out.println(arr.get(0)[1]);

    }
}
