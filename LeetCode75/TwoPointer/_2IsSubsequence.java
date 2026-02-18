package LeetCode75.TwoPointer;

// Example 1:

// Input: s = "abc", t = "ahbgdc"
// Output: true
// Example 2:

// Input: s = "axc", t = "ahbgdc"
// Output: false

public class _2IsSubsequence {
    public static boolean isSubsequence (String str1, String str2){
        int i=0;
        int j=0;
        while (i < str1.length() && j < str2.length()){
            if (str1.charAt(i) == str2.charAt(j)){
                i++;
            }
            j++;
        }
        return i == str1.length();
    }
    public static void main(String[] args) {
        
    }
}



// 392. Is Subsequence
// Solved
// Easy
// Topics
// premium lock icon
// Companies
// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 