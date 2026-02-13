package _2String._1Reverse;

// 2️⃣3️⃣ Multiply Strings
// (Multiply large numbers stored as strings)
// Input
// num1 = "123"
// num2 = "456"
// Output
// "56088"

public class _21MultiplyStrings {

    public static String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0"))
            return "0";

        int m = num1.length();
        int n = num2.length();

        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {

            for (int j = n - 1; j >= 0; j--) {

                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';

                int product = digit1 * digit2;

                int sum = product + result[i + j + 1];

                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }

        // Build final string
        StringBuilder sb = new StringBuilder();

        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String num1 = "123";
        String num2 = "456";

        String result = multiply(num1, num2);

        System.out.println("Output: " + result);
    }
}

