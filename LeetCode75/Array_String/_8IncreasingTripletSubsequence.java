package LeetCode75.Array_String;
// Input: nums = [1,2,3,4,5]
// Output: true
// Explanation: Any triplet where i < j < k is valid.
// Example 2:

// Input: nums = [5,4,3,2,1]
// Output: false
// Explanation: No triplet exists.

// Example 3:

// Input: nums = [2,1,5,0,4,6]
// Output: true
// Explanation: One of the valid triplet is (1, 4, 5), because nums[1] == 1 < nums[4] == 4 < nums[5] == 6.

public class _8IncreasingTripletSubsequence {

    public static boolean increasingTripletSubsequence(int[] arr) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= first) {
                first = arr[i];      // smallest element so far
            } 
            else if (arr[i] <= second) {
                second = arr[i];     // second smallest element
            } 
            else {
                return true;         // found third element greater than both
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 0, 4, 6};
        System.out.println(increasingTripletSubsequence(arr));
    }
}
