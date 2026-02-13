package _2String._1Reverse;

// 2️⃣2️⃣ Decode String
// Input
// s = "3[a2[c]]"
// Output
// "accaccacc"

import java.util.Stack;

public class _20DecodeString {

    public static String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder currentString = new StringBuilder();
        int currentNumber = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            }
            else if (ch == '[') {
                countStack.push(currentNumber);
                stringStack.push(currentString);

                currentNumber = 0;
                currentString = new StringBuilder();
            }
            else if (ch == ']') {

                int repeatTimes = countStack.pop();
                StringBuilder previousString = stringStack.pop();

                for (int i = 0; i < repeatTimes; i++) {
                    previousString.append(currentString);
                }

                currentString = previousString;
            }
            else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {

        String s = "3[a2[c]]";
        String result = decodeString(s);

        System.out.println("Input : " + s);
        System.out.println("Output: " + result);
    }
}



/*
⚡ Optimized Version (Using HashMap)

Better because it jumps left pointer directly.

import java.util.*;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }

            map.put(ch, right);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
*/