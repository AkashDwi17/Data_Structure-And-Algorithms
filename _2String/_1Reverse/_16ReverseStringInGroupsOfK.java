package _2String._1Reverse;

// ✅ 1️⃣9️⃣ Reverse String in Groups of K
// 📥 Input
// s = "abcdefgh", k=3

// 📤 Output
// "cbafedhg"


public class _16ReverseStringInGroupsOfK {

    public static String reverseInGroups(String s, int k) {

        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i += k) {

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

        String s = "abcdefgh";
        int k = 3;

        String result = reverseInGroups(s, k);

        System.out.println("Original: " + s);
        System.out.println("Output  : " + result);
    }
}

