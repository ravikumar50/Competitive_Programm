package LeetCode.Daily_Problems;

public class Redistribution_Of_Character_To_Make_All_String_Equal_1897 {
    public static boolean makeEqual(String[] words) {
        int arr[] = new int[26];
        int n = words.length;

        for(int i=0; i<n; i++){
            String s = words[i];
            for(var a : s.toCharArray()){
                arr[a-97]++;
            }
        }

        for(int i=0; i<26; i++){
            if(arr[i]!=0 && arr[i]%n!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String words[] = {"abc","aabc","bc"};
        boolean ans = makeEqual(words);
        System.out.println(ans);
    }
}
