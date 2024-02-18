public class Main {

    // Helper function to compute the KMP prefix array
    static int[] computePrefixArray(String pattern) {
        int n = pattern.length();
        int[] prefixArray = new int[n];
        int j = 0;

        for (int i = 1; i < n; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = prefixArray[j - 1];
            }

            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            }

            prefixArray[i] = j;
        }

        return prefixArray;
    }

    // Helper function to check if str1 is both a prefix and a suffix of str2 using KMP
    static boolean isPrefixAndSuffix(String str1, String str2) {
        String concatenated = str1 + "#" + str2; // Concatenate str1 and str2 with a separator #

        int[] prefixArray = computePrefixArray(concatenated);
        int n1 = str1.length();
        int n2 = concatenated.length();

        return prefixArray[n2 - 1] == n1;
    }

    // Main function to count the number of index pairs
    static int countPrefixAndSuffixPairs(String[] words) {
        int count = 0;
        int n = words.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {


        String[] words = {"a","ca"};

        int result = countPrefixAndSuffixPairs(words);

        System.out.println("Number of index pairs: " + result);
    }
}
