package SlidingWindow.Variable_Size_Window;
import java.util.*;

// 2. Variable Window Contest Problems

// 2.1 Longest Substring Without Repeating Characters
// 📌 Company: Amazon, Microsoft
// Input: "abcabcbb"
// Output: 3


public class VariableWindowContestProblems {
    public static void longestSubstringWithoutRepeatingCharacters (String str){
        int i = 0;
        int j = 0;
        int maxLen = 0;
        HashSet <Character> set = new HashSet<>();
        while (j < str.length()){
            if (!set.contains(str.charAt(j))){
                set.add (str.charAt(j));
                maxLen = Math.max (maxLen, j-i+1);
                j++;
            }
            else{
                set.remove (str.charAt(i));
                i++;
            }
        }
        System.out.println("Longest substring length: " + maxLen);
    }
    public static void main(String[] args) {
        longestSubstringWithoutRepeatingCharacters ("abcabcbb");
    }
}

