package _2String._1Reverse;

// ✅ 8️⃣ Reverse Words in Place (No Extra Space)
// 🟢 Problem
// Reverse words inside char array.
// 📥 Input
// ["t","h","e"," ","s","k","y"]
// 📤 Output
// ["s","k","y"," ","t","h","e"]
// 💡 Reverse full array → reverse each word.

public class _6ReverseWordsInPlace {

    // Helper method to reverse part of array
    public static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void reverseWords(char[] arr) {

        int n = arr.length;

        // Step 1: Reverse entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse each word
        int si = 0;

        for (int ei = 0; ei <= n; ei++) {

            if (ei == n || arr[ei] == ' ') {
                reverse(arr, si, ei - 1);
                si = ei + 1;
            }
        }
    }

    public static void main(String[] args) {

        char[] arr = {'t','h','e',' ','s','k','y'};

        reverseWords(arr);

        System.out.println(arr);
    }
}
