package PracticeSet1;
import java.util.HashMap;
// 4️⃣ Minimum Window Substring
// Input:
// s = "ADOBECODEBANC"
// t = "ABC"

// Output:
// "BANC"

// Because "BANC" is the smallest substring containing A, B, C.


public class _4MinimumWindowSubstring {

    public static String minimumWindowSubstring(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of characters in t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }


        int left = 0;
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        // Using FOR loop instead of while
        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // If character needed
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);

                if (map.get(ch) >= 0) {
                    count++;
                }
            }

            // If all characters matched
            if (count == t.length()) {

                // Try shrinking window
                while (count == t.length()) {

                    if (right - left + 1 < minLen) {
                        minLen = right - left + 1;
                        startIndex = left;
                    }

                    char leftChar = s.charAt(left);

                    if (map.containsKey(leftChar)) {
                        map.put(leftChar, map.get(leftChar) + 1);

                        if (map.get(leftChar) > 0) {
                            count--;
                        }
                    }

                    left++;
                }
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        } 
        else {
            return s.substring(startIndex, startIndex + minLen);
        }
    }

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minimumWindowSubstring(s, t));
    }
}
