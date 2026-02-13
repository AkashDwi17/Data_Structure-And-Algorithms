package _2String._1Reverse;

// ✅ 1️⃣7️⃣ Reverse Substring Between Given Indices
// 📥 Input
// s = "abcdef", start=2, end=4

// 📤 Output
// "abedcf"


public class _13ReverseSubstringBetweenGivenIndices {

    public static String reverseSubstring(String s, int start, int end) {

        if (s == null || s.length() == 0)
            return s;

        if (start < 0 || end >= s.length() || start > end)
            return s;

        char[] arr = s.toCharArray();

        int left = start;
        int right = end;

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

        String s = "abcdef";
        int start = 2;
        int end = 4;

        String result = reverseSubstring(s, start, end);

        System.out.println("Original: " + s);
        System.out.println("Output  : " + result);
    }
}
