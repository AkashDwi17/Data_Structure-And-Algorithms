package PracticeSet1;

// 2️⃣ Longest Substring Without Repeating Characters

// Input:
// s = "abcabcbb"

// Output:
// 3
import java.util.*;

public class _2LongestSubstringWithoutRepeatingCharacters {
    public static int longestSubString (String str){
        int left = 0;
        int right = 0;
        int maxLen = 0;

        HashSet <Character> set = new HashSet<>();

        while (right < str.length()){
            char ch = str.charAt(right);

            if (!set.contains(ch)){
                set.add (ch);
                maxLen = Math.max(maxLen, right-left+1);
                right ++;
            }
            else{
                set.remove(str.charAt(left));
                left++;
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(longestSubString("abcabcbb"));
    }
}
