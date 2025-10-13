package PrefixSumSuffixSum;
import java.util.*;

// Problem 7: Longest Subarray with Sum K
// Company: Amazon, Adobe
// Input: [10,5,2,7,1,9], K = 15
// Output: 4 (Subarray [5,2,7,1])

public class LongestSubarraywWithSumK {
    public static int longestSubarraywWithSumK(int arr[], int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: Entire subarray from 0 to i
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: subarray with sum k exists in between
            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // Store first occurrence of this prefix sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(longestSubarraywWithSumK(arr, k));
    }
}
