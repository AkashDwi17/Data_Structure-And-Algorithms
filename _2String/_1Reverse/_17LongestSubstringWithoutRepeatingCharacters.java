package _2String._1Reverse;

// 8️⃣ Longest Substring Without Repeating Characters
// (Google, Amazon)
// Input
// s = "abcabcbb"
// Output
// 3

import java.util.HashSet;

public class _17LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;
        int maxLen = 0;

        while (right < s.length()) {

            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);

        System.out.println("Input : " + s);
        System.out.println("Output: " + result);
    }
}
