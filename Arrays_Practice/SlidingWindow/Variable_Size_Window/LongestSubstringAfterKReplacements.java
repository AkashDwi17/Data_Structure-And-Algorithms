package SlidingWindow.Variable_Size_Window;

// 2.8 Longest Substring After K Replacements
// 📌 Company: Microsoft
// Input: "AABABBA", k = 1
// Output: 4

public class LongestSubstringAfterKReplacements {

    public static void longestSubstringAfterKReplacements(String s, int k) {
        int i = 0, j = 0;
        int maxLen = 0;
        int maxFreq = 0;
        int[] freq = new int[26]; // for uppercase letters only (A-Z)

        while (j < s.length()) {
            // include current character
            char ch = s.charAt(j);
            freq[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freq[ch - 'A']);

            // if (window size - most frequent char count) > k → shrink window
            while ((j - i + 1) - maxFreq > k) {
                freq[s.charAt(i) - 'A']--;
                i++;
            }

            // update max length
            maxLen = Math.max(maxLen, j - i + 1);
            j++;
        }

        System.out.println("Longest substring length after at most " + k + " replacements: " + maxLen);
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;

        longestSubstringAfterKReplacements(s, k);
    }
}
