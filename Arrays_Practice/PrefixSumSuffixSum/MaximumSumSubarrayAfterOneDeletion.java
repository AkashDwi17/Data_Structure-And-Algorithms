package PrefixSumSuffixSum;

// Problem 17: Maximum Sum Subarray After One Deletion (LeetCode 1186)

// Input: [1,-2,0,3]
// Output: 4
// Explanation: Delete -2 → sum = 1+0+3=4

public class MaximumSumSubarrayAfterOneDeletion {
    public static int maximumSum(int[] arr) {
        int n = arr.length;
        int noDelete = arr[0];     // max subarray sum without deletion
        int oneDelete = 0;         // max subarray sum with one deletion
        int ans = arr[0];          // global max

        for (int i = 1; i < n; i++) {
            oneDelete = Math.max(noDelete, oneDelete + arr[i]); // delete arr[i] or extend previous deleted subarray
            noDelete = Math.max(arr[i], noDelete + arr[i]);     // normal Kadane’s
            ans = Math.max(ans, Math.max(noDelete, oneDelete)); // track max overall
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 0, 3};
        System.out.println(maximumSum(arr)); // Output: 4
    }
}
