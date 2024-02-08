package Codeforces.Contest.Codeforces_Round_923_Div3;
import java.util.*;
public class B_Following_the_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();

            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            char curr = 'a';
            StringBuilder ans = new StringBuilder("");
            HashMap<Character,Integer> hp = new HashMap<>();
            for(int i=0; i<n; i++){
                if(arr[i]==0){
                    ans.append(curr);
                    hp.put(curr,1);
                    curr++;
                }else{
                    int a = arr[i];

                    for(char ch = 'a'; ch<='z'; ch++){
                        if(hp.containsKey(ch) && hp.get(ch)==a){
                            ans.append(ch);
                            hp.put(ch,hp.get(ch)+1);
                            break;
                        }
                    }
                }
            }
            System.out.println(ans);

            t--;
        }
    }
}
