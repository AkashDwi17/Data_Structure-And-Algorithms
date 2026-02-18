package Tries;
import java.util.*;

public class _5longestWordWithAllPrefix {
    
    public static String findLongestWord(String[] words) {

        HashSet<String> wordSet = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            wordSet.add(words[i]);
        }

        Arrays.sort(words);

        String longestWord = "";

        for (int i = 0; i < words.length; i++) {

            String currentWord = words[i];
            boolean allPrefixesExist = true;

            for (int prefixLength = 1; prefixLength <= currentWord.length(); prefixLength++) {

                String prefix = currentWord.substring(0, prefixLength);

                if (!wordSet.contains(prefix)) {
                    allPrefixesExist = false;
                    break;
                }
            }

            if (allPrefixesExist) {

                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {

        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};

        System.out.println(findLongestWord(words));  // apple
    }
}
