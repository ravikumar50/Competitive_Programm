package Codeforces.Rating_800;

import java.util.Scanner;

public class Fair_PlayOff_1535A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t>0){
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            int arr[] = new int[4];
            for(int i=0; i<4; i++){
                arr[i] = sc.nextInt();
                if(arr[i]>max1){
                    max2 = max1;
                    max1 = arr[i];
                }else if(arr[i]>max2) max2 = arr[i];
            }

            int w1 = (arr[0]>arr[1]) ? arr[0] : arr[1];
            int w2 = (arr[2]>arr[3]) ? arr[2] : arr[3];

            if((max1==w1 && max2==w2) || (max1==w2 && max2==w1)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
