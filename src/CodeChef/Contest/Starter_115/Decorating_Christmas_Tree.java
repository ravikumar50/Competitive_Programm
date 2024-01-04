package CodeChef.Contest.Starter_115;

import java.util.*;g
public class Decorating_Christmas_Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(n>x){
                System.out.println("NO");
            }else{
                int a = Math.min(x,y/3);
                x = x-a;
                n=n-a;
                if(x>=2*n){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
            t--;
        }
    }
}
