package LeetCode75.SlidingWindow;
// Example 1:

// Input: nums = [1,1,0,1]
// Output: 3
// Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
// Example 2:

// Input: nums = [0,1,1,1,0,1,1,0,1]
// Output: 5
// Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].

public class _4LongestSubarrayOf1_sAfterDeletingOneElement {
    public static int longestSubarray (int arr[]){
        int left = 0;
        int right = 0;
        int zeroCount = 0;
        int maxLen = 0;

        while (right < arr.length){
            if (arr[right] == 0){
                zeroCount ++;
            }
            while (zeroCount > 1){
                if (arr[left] == 0){
                    zeroCount --;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left);
            right ++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,1};
        System.out.println(longestSubarray(arr));
    }
}
