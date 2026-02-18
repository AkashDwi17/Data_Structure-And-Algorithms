package PracticeSet1;
import java.util.*;

// 6️⃣ Word Break
// Input:
// s = "leetcode"
// dict = ["leet", "code"]

// Output:
// true


// Because:

// "leet" + "code"

public class _6WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>(wordDict);
        Boolean[] memo = new Boolean[s.length()];
        return helper(s, 0, set, memo);
    }

    private static boolean helper(String s, int start, 
                                  Set<String> set, Boolean[] memo) {

        if (start == s.length()) return true;

        if (memo[start] != null) return memo[start];

        for (int end = start + 1; end <= s.length(); end++) {

            if (set.contains(s.substring(start, end)) &&
                helper(s, end, set, memo)) {

                memo[start] = true;
                return true;
            }
        }

        memo[start] = false;
        return false;
    }
}
