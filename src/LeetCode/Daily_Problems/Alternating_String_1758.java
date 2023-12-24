package LeetCode.Daily_Problems;

public class Alternating_String_1758 {
    public static int minOperations(String s) {
        int m1 = 0;
        int m2 = 0;
        int n = s.length();
        for(int i=0; i<n; i++){
            if(i%2==0){
                if(s.charAt(i)=='1'){
                    m1++;
                }else m2++;
            }else{
                if(s.charAt(i)=='0'){
                    m1++;
                }else m2++;
            }
        }
        return Math.min(m1,m2);
    }

    public static void main(String[] args) {
        String s = "0100";
        System.out.println(minOperations(s));
    }
}
