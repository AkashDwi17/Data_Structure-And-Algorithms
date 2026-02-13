package _2String._1Reverse;


// 🟢 Problem
// Reverse string manually (no reverse() allowed).
// 📥 Input
// s = "world"
// 📤 Output
// "dlrow"
// 💡 Use two pointers or char array swap.

public class _1reverseString {

    public static String reverse(String str) {
    String result = "";

    for (int i = str.length() - 1; i >= 0; i--) {
        result += str.charAt(i);
    }

    return result;
}

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverse(str));
    }
}
