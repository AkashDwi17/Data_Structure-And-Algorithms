package _2String._1Reverse;

// 2️⃣4️⃣ KMP Pattern Matching
// (Find pattern efficiently)
// Input
// text = "abxabcabcaby"
// pattern = "abcaby"
// Output
// 6


public class _22KMPPatternMatching {

    // Step 1: Build LPS Array
    public static int[] buildLPS(String pattern) {

        int[] lps = new int[pattern.length()];
        int length = 0;
        int i = 1;

        while (i < pattern.length()) {

            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }

    // Step 2: KMP Search
    public static int kmpSearch(String text, String pattern) {

        int[] lps = buildLPS(pattern);

        int i = 0; // text index
        int j = 0; // pattern index

        while (i < text.length()) {

            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == pattern.length()) {
                return i - j;  // match found
            }

            else if (i < text.length() &&
                     text.charAt(i) != pattern.charAt(j)) {

                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {

        String text = "abxabcabcaby";
        String pattern = "abcaby";

        int result = kmpSearch(text, pattern);

        System.out.println("Pattern found at index: " + result);
    }
}
