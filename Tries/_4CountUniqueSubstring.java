package Tries;

import java.util.*;

public class _4CountUniqueSubstring {

    public static int countUniqueSubstrings(String str) {

        HashSet<String> uniqueSubstrings = new HashSet<>();

        for (int start = 0; start < str.length(); start++) {

            for (int end = start + 1; end <= str.length(); end++) {

                String substring = str.substring(start, end);
                uniqueSubstrings.add(substring);
            }
        }

        return uniqueSubstrings.size() + 1;  // +1 for empty substring
    }

    public static void main(String[] args) {

        String str = "ababa";
        System.out.println(countUniqueSubstrings(str));  // 10
    }
}
