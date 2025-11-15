package SlidingWindow.Variable_Size_Window;
import java.util.*;

// 2.4 Longest Substring with K Unique Characters
// 📌 Company: TCS NQT, Infosys
// Input: "aabacbebebe", k = 3
// Output: 7 ("cbebebe");

public class LongestSubstringwithKUniqueCharacters {
    

    public static void findLongestSubstringKUnique(String s, int k) {
        int i = 0;
        int j = 0;
        int maxLen = 0;
        int startIndex = 0; // to store starting index of the longest substring

        HashMap<Character, Integer> map = new HashMap<>();

        while (j < s.length()) {
            // Step 1: Add the current character to the map
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // Step 2: If unique characters > k, shrink the window from left
            while (map.size() > k) {
                char leftChar = s.charAt(i);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                i++; // move left pointer
            }

            // Step 3: If exactly k unique characters, check max length
            if (map.size() == k) {
                int currentLen = j - i + 1;
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                    startIndex = i; // record start of this substring
                }
            }

            // Step 4: Expand the window
            j++;
        }

        // Step 5: Print result
        if (maxLen == 0) {
            System.out.println("No substring found with exactly " + k + " unique characters.");
        } else {
            String longestSubstring = s.substring(startIndex, startIndex + maxLen);
            System.out.println("Input String: " + s);
            System.out.println("K = " + k);
            System.out.println("Longest Substring with exactly " + k + " unique characters: " + longestSubstring);
            System.out.println("Length: " + maxLen);
        }
    }
    public static void main(String[] args) {
        String s = "aabacbebebe";
        int k = 3;
        findLongestSubstringKUnique(s, k);
    }
}



