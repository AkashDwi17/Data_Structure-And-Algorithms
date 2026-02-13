package _2String._1Reverse;

// ✅ 1️⃣1️⃣ Reverse Alternate K Characters
// 🟢 Problem
// Reverse every 2k block’s first k characters.
// 📥 Input
// s = "abcdefg", k = 2
// 📤 Output
// "bacdfeg"


public class _8ReverseAlternateKCharacters {

    public static String reverseStr(String s, int k) {

        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i += 2 * k) {

            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
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

        String s = "abcdefg";
        int k = 2;

        String result = reverseStr(s, k);

        System.out.println("Original: " + s);
        System.out.println("Output  : " + result);
    }
}
