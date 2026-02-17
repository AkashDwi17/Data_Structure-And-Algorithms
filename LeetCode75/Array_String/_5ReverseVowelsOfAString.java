package LeetCode75.Array_String;

// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
// Example 1:
// Input: s = "IceCreAm"
// Output: "AceCreIm"

// Explanation:
// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
// Example 2:
// Input: s = "leetcode"
// Output: "leotcede"
 
public class _5ReverseVowelsOfAString {
    public static boolean isVowel (char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public static String reverseVowelsOfAString (String str){
        char arr[] = str.toCharArray();
        int left = 0;
        int right = arr.length-1;

        while (left < right){
            if (!isVowel(arr[left])){
                left ++;
            }
            else if (!isVowel(arr[right])){
                right --;
            }else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left ++;
                right --;
            }
        }
        return new String (arr);
    }
    public static void main(String[] args) {
        
    }
}
