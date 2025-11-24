package PrefixSumSuffixSum;
import java.util.*;

// Problem 10: Count Subarrays Divisible by K (LeetCode 974)

// Company: Google, Amazon
// Input: [4,5,0,-2,-3,1], K=5
// Output: 7

// Explanation is below

public class CountSubarraysDivisiblebyK {

    public static int countSubarraysDivisibleByK(int arr[], int k) {

        // HashMap will store remainder → how many times it has appeared
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: For subarrays starting from index 0
        map.put(0, 1);

        int sum = 0;     // running prefix sum
        int count = 0;   // total subarrays divisible by k

        // Step 2: Traverse the array
        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];    // keep adding elements

            int rem = sum % k;     // find remainder

            // Step 3: Handle negative remainder (make it positive)
            if (rem < 0) {
                rem = rem + k;
            }

            // Step 4: If this remainder has been seen before,
            // it means some subarray between those points is divisible by k
            if (map.containsKey(rem)) {
                count = count + map.get(rem);
            }

            // Step 5: Add this remainder to the map (or increase its count)
            if (map.containsKey(rem)) {
                map.put(rem, map.get(rem) + 1);
            } else {
                map.put(rem, 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 0, -2, -3, 1};
        int k = 5;

        int ans = countSubarraysDivisibleByK(arr, k);
        System.out.println("Total subarrays divisible by " + k + " = " + ans);
    }
}

// Explanation

// - Check subarrays
// For arr = [4,5,0,-2,-3,1] and K=5:
// - [5] → sum = 5 → divisible by 5 ✅
// - [0] → sum = 0 → divisible by 5 ✅
// - [5,0] → sum = 5 → divisible by 5 ✅
// - [0,-2,-3] → sum = -5 → divisible by 5 ✅
// - [5,0,-2,-3] → sum = 0 → divisible by 5 ✅
// - [4,5,0,-2,-3,1] → sum = 5 → divisible by 5 ✅
// - [1,-3,-2,0,5,4] (same as above but reversed check) → also divisible ✅
// - Total = 7 subarrays.
