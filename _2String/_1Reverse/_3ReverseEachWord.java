package _2String._1Reverse;


// ✅ 4️⃣ Reverse Each Word (Not Entire Sentence)
// 🟢 Problem
// Reverse each word but keep word order same.
// 📥 Input
// s = "I love coding"
// 📤 Output
// "I evol gnidoc"
// 💡 Split → reverse each word.

public class _3ReverseEachWord {

    public static String reverse(String s) {

        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {

            StringBuilder temp = new StringBuilder(word);
            result.append(temp.reverse()).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        String s = "I love coding";
        String output = reverse(s);

        System.out.println("Original: " + s);
        System.out.println("Output  : " + output);
    }
}


/*
🧠 Approach 2 (Without split) – Interview Preferred

Using manual traversal (better for interviews)
// s = "I love coding"
// "I evol gnidoc"

public static String reverse(String s) {

    StringBuilder sb = new StringBuilder();
    StringBuilder word = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {

        if (s.charAt(i) != ' ') {
            word.append(s.charAt(i));
        } else {
            sb.append(word.reverse()).append(" ");
            word.setLength(0);   // clear word
        }
    }

    // reverse last word
    sb.append(word.reverse());

    return sb.toString();
}

*/