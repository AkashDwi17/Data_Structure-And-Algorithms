package BinarySearch_5;
import java.util.*;

// Problem 22 — Longest Increasing Subsequence Length via patience (binary-search trick)

// Companies: many
// Statement: Use binary-search on tails array to keep ends; returns length in O(n log n).
// Input: arr=[10,9,2,5,3,7,101,18]
// Output: 4

public class _22LongestIncreasingSubsequence {
    
    public static int lengthOfLIS(int[] nums) {
        ArrayList<Integer> tails = new ArrayList<>();
        
        for (int num : nums) {
            int left = 0, right = tails.size() - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (tails.get(mid) >= num) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            if (left < tails.size()) {
                tails.set(left, num);
            } else {
                tails.add(num);
            }
        }
        
        return tails.size();
    }

    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(arr)); // 4
    }
}

