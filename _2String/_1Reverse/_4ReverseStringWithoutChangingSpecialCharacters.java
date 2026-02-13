package _2String._1Reverse;

// ✅ 5️⃣ Reverse String Without Changing Special Characters
// 🟢 Problem
// Reverse only alphabets, keep special characters in same position.
// 📥 Input
// s = "a,b$c"
// 📤 Output
// "c,b$a"
// 💡 Two pointer skip non-letters.

public class _4ReverseStringWithoutChangingSpecialCharacters {

    public static String reverse(String s) {

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // If left is not alphabet, move left
            if (!Character.isLetter(arr[left])) {
                left++;
            }
            // If right is not alphabet, move right
            else if (!Character.isLetter(arr[right])) {
                right--;
            }
            // If both are alphabets, swap
            else {
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

        String s = "a,b$c";
        String result = reverse(s);

        System.out.println("Original: " + s);
        System.out.println("Reversed: " + result);
    }
}
