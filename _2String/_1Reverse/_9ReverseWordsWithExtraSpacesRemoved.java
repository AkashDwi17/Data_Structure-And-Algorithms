package _2String._1Reverse;

// ✅ 1️⃣2️⃣ Reverse Words With Extra Spaces Removed
// 🟢 Problem

// Remove extra spaces and reverse words.

// 📥 Input
// "  hello   world  "

// 📤 Output
// "world hello"


public class _9ReverseWordsWithExtraSpacesRemoved {

    public static String reverseWords(String s) {

        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {

            // Skip spaces
            while (i >= 0 && s.charAt(i) == ' ')
                i--;

            if (i < 0)
                break;

            int j = i;

            // Find start of word
            while (i >= 0 && s.charAt(i) != ' ')
                i--;

            // Append word
            result.append(s.substring(i + 1, j + 1));
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        String s = "  hello   world  ";
        String result = reverseWords(s);

        System.out.println("Original: \"" + s + "\"");
        System.out.println("Output  : \"" + result + "\"");
    }
}

