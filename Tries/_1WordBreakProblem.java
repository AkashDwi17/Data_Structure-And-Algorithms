package Tries;
import java.util.*;
public class _1WordBreakProblem {
    
    public static boolean wordBreak(String s, String[] words) {

        Set<String> set = new HashSet<>(Arrays.asList(words));
        Boolean[] memo = new Boolean[s.length()];

        return helper(s, set, 0, memo);
    }

    private static boolean helper(String s, Set<String> set, int start, Boolean[] memo) {

        if (start == s.length()) {
            return true;
        }

        if (memo[start] != null) {
            return memo[start];
        }

        for (int end = start + 1; end <= s.length(); end++) {

            if (set.contains(s.substring(start, end)) &&
                helper(s, set, end, memo)) {

                return memo[start] = true;
            }
        }

        return memo[start] = false;
    }

    public static void main(String[] args) {

        String[] words = {"i", "like", "sam", "Samsung", "mobile", "ice"};
        String key = "likeSamsung";

        System.out.println(wordBreak(key, words));  // true
    }
}
