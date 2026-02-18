package PracticeSet1;
import java.util.*;

// 🟢 7️⃣ Group Anagrams
// Input:
// ["eat","tea","tan","ate","nat","bat"]

// Output:
// [
//  ["eat","tea","ate"],
//  ["tan","nat"],
//  ["bat"]
// ]

public class _7GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] input = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(input));
    }
}

