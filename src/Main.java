
import java.awt.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        int arr1[] = new int[n];
        ArrayList<Integer> arr = new ArrayList<>();
        int left[] = new int[n];
        int right[] = new int[n];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            arr1[a-1] = 1;
            arr.add(a-1);
        }
        for(int i=0; i<m; i++){
            arr1[arr.get(i)] = sc.nextInt();
        }

        left[0] = arr1[0];
        left[n-1] = arr1[n-1];

        for(int i=1; i<n-1; i++){
            if(arr1[i]!=0) left[i] = arr1[i];
            else left[i]=left[i-1];
        }

        right[0] = 0;
        right[n-1] = 0;
        for(int i=n-2; i>0; i--){
            if(arr1[i]!=0) right[i] = 0;
            else right[i] = 1+right[i+1];
        }

        for(int i=0; i<q; i++){
            int t = sc.nextInt();
            if(t==1){
                int h = sc.nextInt();
                int v = sc.nextInt();
                arr1[h - 1] = v;
                right[h - 1] = 0;
                int idx = h - 2;
                while (idx > 0 && arr1[idx] == 0) {
                    right[idx] = 1 + right[idx + 1];
                    idx--;
                }
                left[h - 1] = v;
                idx = h;
                while (idx < n - 1 && arr1[idx] == 0) {
                    left[idx] = left[idx - 1];
                    idx++;
                }
            }else{
                long ans = 0;
                int l = sc.nextInt();
                int r = sc.nextInt();
                for(int j=l; j<=r; j++){
                    if(arr1[j-1]!=0) continue;
                    ans += (long)((long)left[j-1]*(long)right[j-1]);
                }
                System.out.println(ans);
            }
        }
    }
}