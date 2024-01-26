package CodeChef.Contest.Starter_118;
import java.util.*;g
public class Literacy_Rate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            double p = sc.nextDouble();
            double l = sc.nextDouble();

            double x = (l/p)*100.0;
            if(x>=75.0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }

    }
}
