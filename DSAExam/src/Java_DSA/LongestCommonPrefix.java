package Java_DSA;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) return "";

        // Start with the first string as prefix
        String prefix = str[0];

        // Compare prefix with each string
        for (int i = 1; i < str.length; i++) {
            // Reduce prefix until it matches the start of strs[i]
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] input = {"floweer", "flow", "flight"};
        System.out.println(longestCommonPrefix(input));  // Output: fl
    }
}

