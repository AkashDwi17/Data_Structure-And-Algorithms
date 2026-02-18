package Tries;

public class _3StartsWithProblem {

    public static boolean startsWith(String[] wordList, String prefix) {

        for (int i = 0; i < wordList.length; i++) {

            if (wordList[i].startsWith(prefix)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] words = {"apple", "app", "mango", "man", "women"};

        System.out.println(startsWith(words, "app"));   // true
        System.out.println(startsWith(words, "moon"));  // false
    }
}
