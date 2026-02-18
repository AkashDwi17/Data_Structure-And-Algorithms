package LeetCode75.SlidingWindow;

// Example 1:

// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
// Example 2:

public class _3MaxConsecutiveOnesIII {
    public static int maxConsecutiveOnesIII (int arr[], int k){
        int left = 0;
        int right = 0;
        int zeroCount = 0;
        int maxLen = 0;

        while (right < arr.length){
            if (arr[right] == 0){
                zeroCount ++;
            }
            while (zeroCount > k){
                if (arr[left] == 0){
                    zeroCount --;
                }
                left ++;
            }
            maxLen = Math.max (maxLen, right-left + 1);
            right ++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(maxConsecutiveOnesIII(arr, k));
    }
}


// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

 

// Example 1:

// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
// Example 2:

// Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
// Output: 10
// Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.