package SORTINGBASEDPROBLEMS_6.CategoryESortingHashCounting;

/*
⭐ 25. Largest Number
🔥 Concept:

Arrange numbers to form largest possible string.

Input
[3,30,34,5,9]

Output
"9534330" */

import java.util.*;

public class _25LargestNumber {

    public static String largestNumber(int[] nums) {

        // Convert numbers to string
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Sort using custom comparator
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // Edge case: If numbers are like [0,0,0]
        if (arr[0].equals("0")) {
            return "0";
        }

        // Build result
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};

        System.out.println(largestNumber(nums));  
        // Output: "9534330"
    }
}

