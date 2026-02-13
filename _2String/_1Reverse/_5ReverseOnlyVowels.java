package _2String._1Reverse;


// ✅ 6️⃣ Reverse Only Vowels
// 🟢 Problem
// Reverse only vowels in string.
// 📥 Input
// s = "hello"
// 📤 Output
// "holle"
// 💡 Two pointer + vowel check.


public class _5ReverseOnlyVowels {

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' 
            || ch == 'o' || ch == 'u';
    }

    public static String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (!isVowel(arr[left])) {
                left++;
            } 
            else if (!isVowel(arr[right])) {
                right--;
            } 
            else {
                // swap vowels
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        String s = "hello";
        String result = reverseVowels(s);

        System.out.println("Original: " + s);
        System.out.println("Output  : " + result);
    }
}
