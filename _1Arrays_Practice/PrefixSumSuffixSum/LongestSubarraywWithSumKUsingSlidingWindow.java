package PrefixSumSuffixSum;

// Problem 7: Longest Subarray with Sum K
// Company: Amazon, Adobe
// Input: [10,5,2,7,1,9], K = 15
// Output: 4 (Subarray [5,2,7,1])

public class LongestSubarraywWithSumKUsingSlidingWindow {
    public static int longestSubarrayWithSumK(int arr[], int k) {
        int left = 0, right = 0;
        int sum = 0, maxLen = 0;

        while (right < arr.length) {
            sum += arr[right];

            // shrink window if sum > k
            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            // check if sum == k
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(longestSubarrayWithSumK(arr, k));
    }
}
