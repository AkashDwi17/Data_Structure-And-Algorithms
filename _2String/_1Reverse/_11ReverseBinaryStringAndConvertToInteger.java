package _2String._1Reverse;

// ✅ 1️⃣5️⃣ Reverse Binary String and Convert to Integer
// 📥 Input
// "1011"

// 📤 Output
// 13 (after reversing → "1101")

public class _11ReverseBinaryStringAndConvertToInteger {
    public static int reverseAndConvert(String s) {

    char[] arr = s.toCharArray();
    int left = 0, right = arr.length - 1;

    // Reverse manually
    while (left < right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }

    int decimal = 0;
    int power = 0;

    // Convert binary to decimal
    for (int i = arr.length - 1; i >= 0; i--) {
        if (arr[i] == '1') {
            decimal += Math.pow(2, power);
        }
        power++;
    }

    return decimal;
}

}
