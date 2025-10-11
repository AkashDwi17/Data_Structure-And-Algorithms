package SlidingWindow.Variable_Size_Window;
import java.util.*;

// 2.1 Longest Substring Without Repeating Characters
// 📌 Company: Amazon, Microsoft
// Input: "abcabcbb"
// Output: 3 ("abc")


public class LongestSubstringWithoutRepeatingCharacters {

    public static void longestSubstringWithoutRepeatingCharacters(String str) {
        int i = 0; // window start
        int j = 0; // window end
        int maxLen = 0;
        int start = 0; // start index of longest substring
        HashSet<Character> set = new HashSet<>();

        while (j < str.length()) {
            char currentChar = str.charAt(j);

            if (!set.contains(currentChar)) {
                set.add(currentChar);
                if (j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    start = i;
                }
                j++;
            } else {
                set.remove(str.charAt(i));
                i++;
            }
        }

        String longestSubstring = str.substring(start, start + maxLen);
        System.out.println("Longest substring: " + longestSubstring);
        System.out.println("Length: " + maxLen);
    }

    public static void main(String[] args) {
        longestSubstringWithoutRepeatingCharacters("abcabcbb");
    }
}
