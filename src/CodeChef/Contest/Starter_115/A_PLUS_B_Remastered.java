package CodeChef.Contest.Starter_115;

import java.util.*;
public class A_PLUS_B_Remastered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[n];
            for(int i=0; i<n; i++){
                arr1[i] = sc.nextInt();
            }
            for(int i=0; i<n; i++){
                arr2[i] = sc.nextInt();
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int a = arr1[0]+arr2[n-1];
            int count = 0;
            for(int i=0; i<n; i++){
                int sum = arr1[i]+arr2[n-1-i];
                if(a!=sum){
                    System.out.println(-1);
                    count++;
                    break;
                }
            }
            if(count==0){
                for(int i=0; i<n; i++){
                    System.out.print(arr1[i]+" ");
                }
                System.out.println();
                for(int i=n-1; i>=0; i--){
                    System.out.print(arr2[i]+" ");
                }
            }
            System.out.println();
            t--;

        }

    }
}
