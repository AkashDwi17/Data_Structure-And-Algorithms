package BinarySearch_5;

// Problem 16 — Split Array Largest Sum (LeetCode 410)

// Companies: Amazon, Google
// Statement: Split into m subarrays minimize largest sum; binary on max allowed sum.
// Input: nums=[7,2,5,10,8], m=2
// Output: 18
// for nums = [7,2,5,10,8] and m = 2, the minimum possible largest subarray sum is 18 (splits: [7,2,5] → 14 and [10,8] → 18).


// Explanation

public class _16SplitArrayLargestSum {
    
    public static int maxWindowSum(int[] arr, int windowSize) {

        int currentWindowSum = 0;
        int maxWindowSum = Integer.MIN_VALUE;

        // Step 1: Calculate the sum of the first window
        for (int i = 0; i < windowSize; i++) {
            currentWindowSum += arr[i];
        }

        maxWindowSum = Math.max(maxWindowSum, currentWindowSum);

        // Step 2: Slide the window
        for (int i = windowSize; i < arr.length; i++) {
            currentWindowSum = currentWindowSum - arr[i - windowSize] + arr[i];
            maxWindowSum = Math.max(maxWindowSum, currentWindowSum);
        }

        return maxWindowSum;
    }

    public static void main(String[] args) {
        int arr[] = {7, 2, 5, 10, 8};
        System.out.println(maxWindowSum(arr, 2));  // Output: 18
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
