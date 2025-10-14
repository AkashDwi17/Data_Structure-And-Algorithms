package KADANESALGORITHM;


// 4.1 Basic Kadane’s Algorithm (Easy Level)
// 🧠 Problem 1: Maximum Subarray Sum (Classic)

// Company: Amazon, Microsoft, TCS, Google
// Statement: Find the contiguous subarray with maximum sum.
// Input: arr = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: Subarray = [4,-1,2,1]


public class MaximumSubarraySum {

    public static int maximumSubarraySum (int arr[]){
        int currSum = arr[0];
        int maxSum = arr[0];

        for (int i=1; i<arr.length; i++){
            currSum = Math.max (arr[i], currSum+arr[i]);
            maxSum = Math.max (currSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubarraySum(arr));
    }
}
