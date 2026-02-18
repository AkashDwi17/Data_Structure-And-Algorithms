package PracticeSet1;

// Input:
// arr = [2,1,5,1,3,2], k = 3

// Output:
// 9

public class _1MaximumSumSubarrayOfSizeK {
    public static int maximumSumSubarrayOfSizeK (int arr[], int k){
        int sum = 0;
        int maxSum = 0;
        for (int i=0; i<k; i++){
            sum += arr[i];
        }
        maxSum = sum;

        for (int i=k; i<arr.length; i++){
            sum = sum - arr[i-k]+ arr[i];
            maxSum = Math.max (sum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,1,3,2};
        int k = 3;
        System.out.println(maximumSumSubarrayOfSizeK(arr, k));
    }
}
