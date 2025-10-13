package PrefixSumSuffixSum;
import java.util.*;

// Problem 3: Running Sum of 1D Array (LeetCode 1480)

// Company: Amazon
// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]

public class RunningSumof1DArray {
    public static int[] runningSumof1DArray (int nums[]){
       int ans [] = new int [nums.length];
        int sum = 0;
        for (int i=0; i<nums.length; i++){
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
       System.out.println(Arrays.toString(runningSumof1DArray(nums)));
       
    }
}
