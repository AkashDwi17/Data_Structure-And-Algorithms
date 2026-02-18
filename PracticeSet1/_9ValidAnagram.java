package PracticeSet1;

// 9️⃣ Valid Anagram
// Input:
// s = "anagram"
// t = "nagaram"

// Output:
// true
// Because both contain same characters with same frequency.
import java.util.Arrays;

public class _9ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}
