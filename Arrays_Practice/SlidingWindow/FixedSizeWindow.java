package SlidingWindow;

// 1.1 Maximum Sum Subarray of Size k
// Input: arr = [2, 1, 5, 1, 3, 2], k = 3
// Output: 9 → (5+1+3)

public class FixedSizeWindow {
    
    public static int maxSubArrSum (int arr[], int k){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i<k; i++){
            sum += arr[i];
        }
        maxSum = sum;
        for (int i=k; i<arr.length; i++){
            sum = sum-arr[i-k] + arr[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        
        System.out.println(maxSubArrSum(arr, 3));
    }
}
