package _2String._1Reverse;

// ✅ 1️⃣3️⃣ Reverse Only Letters (Ignore Numbers)
// 📥 Input
// "a1b2c3"

// 📤 Output
// "c1b2a3"

public class _10ReverseOnlyLetters {

    public static String reverseOnlyLetters(String s) {

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (!Character.isLetter(arr[left])) {
                left++;
            } 
            else if (!Character.isLetter(arr[right])) {
                right--;
            } 
            else {
                // swap letters
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

        String s = "a1b2c3";
        String result = reverseOnlyLetters(s);

        System.out.println("Original: " + s);
        System.out.println("Output  : " + result);
    }
}

