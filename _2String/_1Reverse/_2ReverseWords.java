package _2String._1Reverse;

// Reverse Words in a Sentence
//  Problem
// Reverse words but keep word characters intact.
//  Input
// s = "I love coding"
//  Output
// "coding love I"
// 💡 Split + reverse order.

public class _2ReverseWords {
    public static void main(String[] args) {
        String str = "I love coding";

        String[] words = str.split(" ");
        
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
