package SlidingWindow.Variable_Size_Window;
import java.util.*;

// 2.6 Substrings of Length K with K Distinct Characters
// 📌 Contest: LeetCode Biweekly
// Input: "havefunonleetcode", k = 5
// Output: 6

public class SubstringsofLengthKwithKDistinctCharacters {

    // Method to count substrings of length k with k distinct characters
    public static void substringsofLengthKwithKDistinctCharacters(String s, int k) {
        if (s.length() < k) {
            System.out.println("Number of substrings: 0");
            return;
        }

        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;

        while (j < s.length()) {
            // Add current character
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Window size reached k
            if (j - i + 1 == k) {
                if (map.size() == k) {
                    count++; // valid substring
                }

                // Remove leftmost character before sliding window
                char leftChar = s.charAt(i);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                i++; // slide window
            }

            j++; // expand window
        }

        System.out.println("Number of substrings of length " + k + " with " + k + " distinct characters: " + count);
    }

    public static void main(String[] args) {
        String s = "havefunonleetcode";
        int k = 5;

        // Call the method
        substringsofLengthKwithKDistinctCharacters(s, k);
    }
}
