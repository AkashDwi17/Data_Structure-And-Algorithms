package _2String._1Reverse;

// ✅ 🔟 Reverse First K Characters
// 🟢 Problem

// Reverse first k characters only.

// 📥 Input
// s = "abcdefg", k = 3

// 📤 Output
// "cbadefg"


public class _7ReverseFirstKCharacters {

    public static String reverseFirstK(String s, int k) {

        if (s == null || s.length() == 0 || k <= 0)
            return s;

        char[] arr = s.toCharArray();

        if (k > arr.length)
            k = arr.length;

        int left = 0;
        int right = k - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        String s = "abcdefg";
        int k = 3;

        String result = reverseFirstK(s, k);

        System.out.println("Original: " + s);
        System.out.println("Output  : " + result);
    }
}
