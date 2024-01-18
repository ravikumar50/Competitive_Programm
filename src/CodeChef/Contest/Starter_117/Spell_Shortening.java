package CodeChef.Contest.Starter_117;
import java.util.*;
public class Spell_Shortening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            String ans = "";
            for(int i=0; i<n-1; i++){
                if(s.charAt(i)>s.charAt(i+1)){
                    ans = s.substring(0,i)+s.substring(i+1,n);
                    count = 1;
                    break;
                }
            }
            if(count==1){
                System.out.println(ans);
            }else{
                System.out.println(s.substring(0,n-1));
            }
            t--;
        }
    }
}
