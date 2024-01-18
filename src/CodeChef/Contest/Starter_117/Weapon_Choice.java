package CodeChef.Contest.Starter_117;
import java.util.*;

public class Weapon_Choice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int h = sc.nextInt();
            int x = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int k = sc.nextInt();

            int ans1 = (int)Math.ceil(h/(x*1.0));
            int ans2 = 0;

            if(y1*k>=h) ans2 = (int)Math.ceil(h/(y1*1.0));
            else{
                ans2 = k;
                h = h-(y1*k);
g                ans2 = ans2+(int)Math.ceil(h/(y2*1.0));
            }

            System.out.println(Math.min(ans1,ans2));

            t--;
        }
    }
}
