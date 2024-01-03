package LeetCode.Daily_Problems;

public class Number_Of_Laser_Beams_In_The_Bank {
    public static int numberOfBeams(String[] bank) {
        int ans = 0;
        int prev = 0;
        int n = bank.length;
        for(int i=0; i<n; i++){
            String s = bank[i];
            int count = 0;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)=='1') count++;
            }
            if(count>0){
                ans = ans + prev*count;
                prev = count;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String arr[] = {"011001","000000","010100","001000"};
        int ans = numberOfBeams(arr);
        System.out.println(ans);
    }
}
