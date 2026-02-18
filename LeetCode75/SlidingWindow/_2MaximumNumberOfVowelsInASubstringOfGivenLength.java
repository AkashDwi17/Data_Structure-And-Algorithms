package LeetCode75.SlidingWindow;

// Example 1:

// Input: s = "abciiidef", k = 3
// Output: 3
// Explanation: The substring "iii" contains 3 vowel letters.
// Example 2:

// Input: s = "aeiou", k = 2
// Output: 2
// Explanation: Any substring of length 2 contains 2 vowels.
// Example 3:

// Input: s = "leetcode", k = 3
// Output: 2
// Explanation: "lee", "eet" and "ode" contain 2 vowels.

public class _2MaximumNumberOfVowelsInASubstringOfGivenLength {

    public static boolean isVowel (char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    public static int maxVowel (String str, int k){
        int count = 0;
        int maxCount = 0;
        for (int i=0; i<k; i++){
            if (isVowel (str.charAt(i))){
                count ++;
            }
        }
        maxCount = count;

        for (int i=k; i<str.length(); i++){
            if (isVowel(str.charAt(i-k))){
                count --;
            }
            if (isVowel(str.charAt(i))){
                count ++;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        String str = "leetcode";
        int k = 3;
        System.out.print (maxVowel(str, k));
    }
}
