package SlidingWindow.Variable_Size_Window;

import java.util.HashMap;
import java.util.Map;

// 2.2 Minimum Window Substring
// Company: Google, Facebook
// Input: s = "ADOBECODEBANC", t = "ABC"
// Output: "BANC"

public class minimumWindowSubstring {

    public static String minWindow(String s, String t) {

        // if either string is empty, return nothing
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        // Step 1: Count how many times each letter appears in t
        Map<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (need.containsKey(c)) {
                need.put(c, need.get(c) + 1);
            } else {
                need.put(c, 1);
            }
        }

        // how many different letters we need to find
        int required = need.size();
        int formed = 0;  // how many letters are matched now

        Map<Character, Integer> window = new HashMap<>();

        int left = 0, right = 0;
        int[] ans = {-1, 0, 0}; // {length, start, end}

        // Step 2: Move the right pointer to expand the window
        while (right < s.length()) {

            char c = s.charAt(right);

            if (window.containsKey(c)) {
                window.put(c, window.get(c) + 1);
            } else {
                window.put(c, 1);
            }

            // if this letter count matches what we need
            if (need.containsKey(c) && window.get(c).intValue() == need.get(c).intValue()) {
                formed++;
            }

            // Step 3: Try to make the window smaller from the left side
            while (left <= right && formed == required) {

                c = s.charAt(left);

                // check if this window is smaller than before
                if (ans[0] == -1 || (right - left + 1) < ans[0]) {
                    ans[0] = right - left + 1;
                    ans[1] = left;
                    ans[2] = right;
                }

                // remove the left character from the window
                window.put(c, window.get(c) - 1);
                if (need.containsKey(c) && window.get(c) < need.get(c)) {
                    formed--;
                }

                left++; // move the left side
            }

            right++; // move the right side
        }

        // Step 4: Return answer using if-else
        if (ans[0] == -1) {
            return "";
        } else {
            return s.substring(ans[1], ans[2] + 1);
        }
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = minWindow(s, t);
        System.out.println("Minimum Window Substring: " + result);
    }
}
