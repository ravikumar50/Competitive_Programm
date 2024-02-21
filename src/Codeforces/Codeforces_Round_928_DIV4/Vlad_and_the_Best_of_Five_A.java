package Codeforces.Codeforces_Round_928_DIV4;
import java.util.*;
public class Vlad_and_the_Best_of_Five_A
{

    // Driver code to test above methods
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            String s = sc.next();
            int cx=0,cy=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='A') cx++;
                else cy++;
            }
            if(cx>=cy) System.out.println("A");
            else System.out.println("B");
            t--;
        }
    }
}
