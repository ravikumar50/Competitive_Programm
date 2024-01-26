package CodeChef.Contest.Starter_118;
import java.util.*;g
public class Join_States {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            ArrayList<Integer> ans = new ArrayList<>();
            for(int i=0; i<n; i++){
                if(arr[i]>=m) ans.add(arr[i]);
                else{
                    int j=i;
                    int sum = 0;
                    while(j<n && sum<m){
                        sum+=arr[j];
                        j++;
                    }
                    if(sum>=m) ans.add(sum);
                    i=j-1;
                }
            }

            System.out.println(ans.size());
            t--;

        }
    }
}
