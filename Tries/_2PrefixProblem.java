package Tries;
import java.util.*;
public class _2PrefixProblem {

    public static String findShortestUniquePrefix(String currentWord, String[] wordList) {

        for (int prefixLength = 1; prefixLength <= currentWord.length(); prefixLength++) {

            String currentPrefix = currentWord.substring(0, prefixLength);
            boolean prefixIsUnique = true;

            for (int index = 0; index < wordList.length; index++) {

                String otherWord = wordList[index];

                if (!otherWord.equals(currentWord) &&
                    otherWord.startsWith(currentPrefix)) {

                    prefixIsUnique = false;
                    break;
                }
            }

            if (prefixIsUnique) {
                return currentPrefix;
            }
        }

        return currentWord; // fallback
    }

    public static void main(String[] args) {

        String[] words = {"zebra", "dog", "duck", "dove"};

        for (int i = 0; i < words.length; i++) {
            String result = findShortestUniquePrefix(words[i], words);
            System.out.println(result);
        }
    }
}
