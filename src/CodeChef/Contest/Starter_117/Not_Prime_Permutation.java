package CodeChef.Contest.Starter_117;
import java.util.*;
public class Not_Prime_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int ans[] = new int[n];
            int count = 0;
            if(n==1 || n==2){
                System.out.print(-1);
                count = 1;
            }
            else if(n%2!=0){
                for(int i=0; i<n; i++){
                    ans[i] = n+1-arr[i];
                }
            }else{
                for(int i=0; i<n; i++){
                    if(arr[i]+2<=n) ans[i] = arr[i]+2;
                    else if(arr[i]==n) ans[i] = 2;
                    else ans[i] = 1;
                }
            }

            if(count==0){
                for(int i=0; i<n; i++){
                    System.out.print(ans[i]+" ");
                }
            }
            System.out.println();

            t--;
        }

    }
}
