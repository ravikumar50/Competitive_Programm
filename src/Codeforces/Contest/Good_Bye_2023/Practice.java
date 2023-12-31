package Codeforces.Contest.Good_Bye_2023;
public class Practice {
    public static int longestSpecialSubstring(String s) {
        int maxLength = -1;
        int currentLength = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                currentLength++;
            } else {
                if (currentLength >= 3) {
                    maxLength = Math.max(maxLength, currentLength);
                }
                currentLength = 1;
            }
        }

        // Check the last substring
        if (currentLength >= 3) {
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {

    }
}
