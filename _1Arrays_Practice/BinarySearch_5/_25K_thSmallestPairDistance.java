package BinarySearch_5;

import java.util.Arrays;

// Problem 25 — K-th Smallest Pair Distance (LeetCode 719)

// Companies: LeetCode contests
// Statement: Binary on distance; count pairs with dist ≤ mid using two-pointers.
// Input: nums=[1,3,1], k=1
// Output: 0

public class _25K_thSmallestPairDistance {
    
    // Counts pairs with distance <= mid
    private static int countPairs(int[] nums, int mid) {
        int count = 0, j = 0;
        for (int i = 0; i < nums.length; i++) {
            while (j < nums.length && nums[j] - nums[i] <= mid) {
                j++;
            }
            count += j - i - 1;
        }
        return count;
    }

    public static int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums); // sort first for two-pointer
        int si = 0;
        int ei = nums[nums.length - 1] - nums[0];

        while (si < ei) {
            int mid = si + (ei - si) / 2;
            if (countPairs(nums, mid) >= k) {
                ei = mid;
            } else {
                si = mid + 1;
            }
        }
        return si;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,1};
        int k = 1;
        System.out.println(smallestDistancePair(nums, k)); // 0
    }
}
