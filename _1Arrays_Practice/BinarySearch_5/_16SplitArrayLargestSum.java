package BinarySearch_5;

// Problem 16 — Split Array Largest Sum (LeetCode 410)

// Companies: Amazon, Google
// Statement: Split into m subarrays minimize largest sum; binary on max allowed sum.
// Input: nums=[7,2,5,10,8], m=2
// Output: 18
// for nums = [7,2,5,10,8] and m = 2, the minimum possible largest subarray sum is 18 (splits: [7,2,5] → 14 and [10,8] → 18).


// Explanation

public class _16SplitArrayLargestSum {
    
    // Check if it is possible to split nums into at most m subarrays
    // such that each subarray has sum <= allowedMaxSum
    private static boolean canSplit(int[] nums, int maxSubarrays, long allowedMaxSum) {

        int subarrayCount = 1;     // we start with one subarray
        long currentSubarraySum = 0;

        for (int num : nums) {
            if (currentSubarraySum + num <= allowedMaxSum) {
                currentSubarraySum += num;
            } else {
                subarrayCount++;
                currentSubarraySum = num;

                if (subarrayCount > maxSubarrays) {
                    return false;   // too many subarrays → not possible
                }
            }
        }

        return true;  // valid split under allowedMaxSum
    }

    // Main function to compute the minimum largest subarray sum
    public static int splitArray(int[] nums, int m) {

        long lowerBound = 0;   // lowest possible answer (max element)
        long upperBound = 0;   // highest possible answer (sum of all elements)

        for (int num : nums) {
            lowerBound = Math.max(lowerBound, num);
            upperBound += num;
        }

        long optimalLargestSum = upperBound;

        while (lowerBound <= upperBound) {

            long midCap = lowerBound + (upperBound - lowerBound) / 2;

            if (canSplit(nums, m, midCap)) {
                optimalLargestSum = midCap;     // possible, try smaller value
                upperBound = midCap - 1;
            } else {
                lowerBound = midCap + 1;        // not possible, need larger value
            }
        }

        return (int) optimalLargestSum;
    }

    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int m = 2;

        System.out.println(splitArray(nums, m));  // Output: 18
    }
}



// ⭐ Example 1 (easy to understand)
// Input:
// nums = [7,2,5,10,8], m = 2

// All valid ways to split into 2 parts:
// Split	Subarray Sums	Largest Sum
// [7]	[2,5,10,8]	7 vs 25 → 25
// [7,2]	[5,10,8]	9 vs 23 → 23
// [7,2,5]	[10,8]	14 vs 18 → 18
// [7,2,5,10]	[8]	24 vs 8 → 24

// ➡ Minimum possible largest sum = 18
