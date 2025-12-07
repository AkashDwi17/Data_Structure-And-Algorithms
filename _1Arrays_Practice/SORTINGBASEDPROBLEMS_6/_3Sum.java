package SORTINGBASEDPROBLEMS_6;


// 2. 3Sum — Triplet Sum to Zero

// 📌 Problem:
// Find all unique triplets where arr[i]+arr[j]+arr[k] = 0.

// Input: [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]

// Companies: Amazon, Meta, Microsoft

import java.util.*;

public class _3Sum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Step 1: Sort the array

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicates for left pointer
                    while (left < right && nums[left] == nums[left - 1]) left++;

                    // Skip duplicates for right pointer
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
                else if (sum < 0) {
                    left++;    // Need a larger value
                }
                else {
                    right--;   // Need a smaller value
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr));
    }
}

