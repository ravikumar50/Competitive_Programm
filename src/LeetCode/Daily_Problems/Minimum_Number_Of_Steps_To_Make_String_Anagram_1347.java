package LeetCode.Daily_Problems;

public class Minimum_Number_Of_Steps_To_Make_String_Anagram_1347 {

    static int[] validAnagram(String s){

        int[] ans = new int[26];

        for(char c : s.toCharArray()){

            ans[c - 'a']++;
        }


        return ans;


    }
    public static void main(String[] args) {
        String s = "leetcode";
        String t = "practice";
        int[] res = validAnagram(s);
        int[] res1 = validAnagram(t);

        int ans = 0;

        for(int i = 0 ; i < 26 ; i++){
            if(res1[i]  < res[i]){
                ans+= res[i] - res1[i];
            }
        }
        System.out.println(ans);
    }
}
