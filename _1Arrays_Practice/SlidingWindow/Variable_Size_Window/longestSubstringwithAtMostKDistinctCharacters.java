package SlidingWindow.Variable_Size_Window;
import java.util.*;

// 2.3 Longest Substring with At Most K Distinct Characters
// 📌 Company: Google
// Input: "eceba", k = 2
// Output: 3 ("ece")


public class longestSubstringwithAtMostKDistinctCharacters {
    public static int longestSubstringWithKDistinct(String s, int k) {
        // if string is empty or k = 0
        if (s.length() == 0 || k == 0) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;       // window start
        int right = 0;      // window end
        int maxLength = 0;  // store the result

        while (right < s.length()) {
            char c = s.charAt(right);

            // Add character to map (or increase its count)
            map.put (c, map.getOrDefault(c, 0)+1);

            // If more than k distinct characters, shrink from left
            while (map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++; // move left pointer forward
            }

            // Update answer if current window is longer
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
            }

            right++; // expand window
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        int result = longestSubstringWithKDistinct(s, k);
        System.out.println("Longest substring length with at most " + k + " distinct characters: " + result);
        // Output: 3 ("ece")
    }
}
