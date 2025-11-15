package PrefixSumSuffixSum;
import java.util.*;

// Problem 6: Subarray Sum Equals K (LeetCode 560)

// Company: Amazon, Flipkart
// Input: [1,1,1], k = 2
// Output: 2
// Explanation: Subarrays = [1,1] at (0,1) and (1,2)

public class SubarraySumEqualsK {
    public static int subarraySumEqualsK (int arr[], int k){
        int count = 0;
        for (int i=0; i<arr.length; i++){
            int sum = 0;
            for (int j=i; j<arr.length; j++){
                sum += arr[i];
                
                if (sum == k){
                    System.out.print(i+","+j +"  ");
                    System.out.println();
                    count ++;
                }
            }
        }
        System.out.println("Total Count:");
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1};
        System.out.println(subarraySumEqualsK (arr, 2));
    }
}
