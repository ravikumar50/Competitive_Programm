package Codeforces.Rating_1000;

import java.util.Scanner;

public class String_LCM_1473_B {

    static int LCM(int x, int y){

        int max = Math.max(x,y);
        int min = Math.min(x,y);

        for(int i=1; i<=min; i++){
            if((max*i)%min==0) return max*i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t>0){
            String a = sc.next();
            String b = sc.next();
            StringBuilder s1 = new StringBuilder(a);
            StringBuilder s2 = new StringBuilder(b);
            int n1 = s1.length();
            int n2 = s2.length();
            int lcm = LCM(n1,n2);
            n1 = lcm/n1;
            n2 = lcm/n2;


            String str1 = s1.append(s1.toString().repeat(n1-1)).toString();
            String str2 = s2.append(s2.toString().repeat(n2-1)).toString();


            if(str1.equals(str2)){
                System.out.println(str1);
            }else{
                System.out.println(-1);
            }
            t--;
        }
    }
}
