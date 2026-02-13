package _2String._1Reverse;

// ✅ 1️⃣6️⃣ Reverse Words but Keep Special Punctuation in Place
// 📥 Input
// "Hello, world!"
// 📤 Output
// "world, Hello!"



import java.util.*;

public class _12ReverseWords {

    public static String reverseWordsKeepPunctuation(String s) {

        int n = s.length();
        List<String> words = new ArrayList<>();
        StringBuilder temp = new StringBuilder();

        // Step 1: Extract words
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                temp.append(ch);
            } else {
                if (temp.length() > 0) {
                    words.add(temp.toString());
                    temp.setLength(0);
                }
            }
        }

        if (temp.length() > 0) {
            words.add(temp.toString());
        }

        // Step 2: Reverse word list
        Collections.reverse(words);

        // Step 3: Rebuild string
        StringBuilder result = new StringBuilder();
        int wordIndex = 0;
        int charIndex = 0;

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (!Character.isLetter(ch)) {
                result.append(ch); // keep punctuation
            } else {
                result.append(words.get(wordIndex).charAt(charIndex));
                charIndex++;

                if (charIndex == words.get(wordIndex).length()) {
                    wordIndex++;
                    charIndex = 0;
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String s = "Hello, world!";
        String result = reverseWordsKeepPunctuation(s);

        System.out.println("Original: " + s);
        System.out.println("Output  : " + result);
    }
}
