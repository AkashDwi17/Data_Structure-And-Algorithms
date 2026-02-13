package _2String._1Reverse;
// ✅ 1️⃣8️⃣ Reverse and Toggle Case
// 📥 Input
// "AbC"

// 📤 Output
// "cBa"

public class _14ReverseAndToggleCase {

    public static String reverseAndToggle(String s) {

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        // Step 1: Reverse
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        // Step 2: Toggle case
        for (int i = 0; i < arr.length; i++) {

            if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            } 
            else if (Character.isLowerCase(arr[i])) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        String s = "AbC";
        String result = reverseAndToggle(s);

        System.out.println("Original: " + s);
        System.out.println("Output  : " + result);
    }
}
