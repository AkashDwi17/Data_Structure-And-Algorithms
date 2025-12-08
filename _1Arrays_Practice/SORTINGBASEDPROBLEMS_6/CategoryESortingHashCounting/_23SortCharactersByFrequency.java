package SORTINGBASEDPROBLEMS_6.CategoryESortingHashCounting;

/*
⭐ 23. Sort Characters by Frequency
🔥 Concept:

Given a string, sort characters by occurrence.

Input
s = "tree"

Output
"eert"
 */

import java.util.*;

public class _23SortCharactersByFrequency {

    public static String frequencySort(String s) {

        // Step 1: Count frequencies
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Step 2: Create buckets (index = frequency)
        List<Character>[] buckets = new ArrayList[s.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            buckets[i] = new ArrayList<>();
        }

        // Step 3: Put characters into correct bucket
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            buckets[count].add(ch);
        }

        // Step 4: Build result from highest freq to lowest
        StringBuilder sb = new StringBuilder();

        for (int i = buckets.length - 1; i >= 0; i--) {
            for (char ch : buckets[i]) {
                // Append character i times
                for (int repeat = 0; repeat < i; repeat++) {
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));  // Output: "eert" or "eetr"
    }
}

