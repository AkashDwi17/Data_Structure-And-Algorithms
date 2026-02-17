package LeetCode75;
// Example 1:

// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r
// Example 2:

// Input: word1 = "ab", word2 = "pqrs"
// Output: "apbqrs"
// Explanation: Notice that as word2 is longer, "rs" is appended to the end.
// word1:  a   b 
// word2:    p   q   r   s
// merged: a p b q   r   s

import java.util.*;

public class _1MergeStringsAlternately {
    public static String mergeStringsAlternately (String str1, String str2){
        StringBuilder sb = new StringBuilder("");
        
        int i = 0;

        while (i < str1.length() || i < str2.length()){
            if (i < str1.length()){
                sb.append(str1.charAt(i));
            }
            if (i < str2.length()){
                sb.append(str2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
    public static void main (String args[]){
        String str1 = "abc";
        String str2 = "xyz";
        System.out.println(mergeStringsAlternately(str1, str2));
    }
}
