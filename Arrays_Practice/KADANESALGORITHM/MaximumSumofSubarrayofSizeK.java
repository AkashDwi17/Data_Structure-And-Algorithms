package KADANESALGORITHM;
import java.util.*;

// Problem 3: Maximum Sum of Subarray of Size K

// Company: TCS, Infosys
// Input: arr = [2,1,5,1,3,2], k=3
// Output: 9
// Explanation: Subarray [5,1,3]

public class MaximumSumofSubarrayofSizeK {
    public static int maximumSumofSubarrayofSizeK (int arr[], int k){
        int sum = 0;
        int maxSum = 0;

        for (int i=0; i<k; i++){
            sum += arr[i];
        }
        maxSum = sum;
        for (int i=k; i<arr.length; i++){
            sum = sum - arr[i-k] + arr[i];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,1,3,2};
        System.out.println(maximumSumofSubarrayofSizeK(arr, 3));
    }
}
