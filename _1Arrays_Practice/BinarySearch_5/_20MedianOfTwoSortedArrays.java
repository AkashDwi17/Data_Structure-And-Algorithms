package BinarySearch_5;

// Problem 20 — Median of Two Sorted Arrays (LeetCode 4) — log(min(n,m))

// Companies: Google, Facebook (hard)
// Statement: Use binary search on partition index in smaller array.
// Input: nums1=[1,3], nums2=[2]
// Output: 2.0

public class _20MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n = nums1.length;
        int m = nums2.length;
        int low = 0;
        int high = n;

        // total numbers on left side should be (n+m+1)/2
        while (low <= high) {
            int i = low + (high - low) / 2;                  // partition in nums1
            int j = (n + m + 1) / 2 - i;                    // partition in nums2

            // Edge handling: if partition at array ends use +/-infty
            int leftA  = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int rightA = (i == n) ? Integer.MAX_VALUE : nums1[i];

            int leftB  = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int rightB = (j == m) ? Integer.MAX_VALUE : nums2[j];

            // Check if partition is correct
            if (leftA <= rightB && leftB <= rightA) {
                // Found correct partition
                if ((n + m) % 2 == 0) {
                    int maxLeft = Math.max(leftA, leftB);
                    int minRight = Math.min(rightA, rightB);
                    return (maxLeft + minRight) / 2.0;
                } else {
                    return (double) Math.max(leftA, leftB);
                }
            } else if (leftA > rightB) {
                // too many elements taken from A -> move left in A
                high = i - 1;
            } else {
                // leftB > rightA -> need to move right in A
                low = i + 1;
            }
        }

        // should never reach here if inputs are valid sorted arrays
        throw new IllegalArgumentException("Input arrays are not valid sorted arrays.");
    }

    // quick demo
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2)); // 2.0

        int[] a = {1, 2};
        int[] b = {3, 4};
        System.out.println(findMedianSortedArrays(a, b)); // 2.5
    }
}
