package _2String._1Reverse;

// 1️⃣5️⃣ Roman to Integer
// (Amazon, Google)
// Input
// s = "MCMXCIV"
// Output
// 1994

import java.util.HashMap;

public class _18RomantoInteger {

    public static int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int current = map.get(s.charAt(i));

            if (i < s.length() - 1 &&
                current < map.get(s.charAt(i + 1))) {

                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }

    public static void main(String[] args) {

        String s = "MCMXCIV";
        int result = romanToInt(s);

        System.out.println("Input : " + s);
        System.out.println("Output: " + result);
    }
}

