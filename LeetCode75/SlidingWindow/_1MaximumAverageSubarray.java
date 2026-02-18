package LeetCode75.SlidingWindow;

// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
import java.util.*;

public class _1MaximumAverageSubarray {
    public static double maximumAverageSubarray (int arr[], int k){

        double sum = 0;
        double maxSum = 0;
        for (int i=0; i<k; i++){
            sum += arr[i];
        }
        maxSum = sum;

        for (int i=k; i<arr.length; i++){
            sum = sum-arr[i-k]+arr[i];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum/k;
    }
    public static void main(String[] args) {
        int arr[] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(maximumAverageSubarray(arr, k));
    }
}



