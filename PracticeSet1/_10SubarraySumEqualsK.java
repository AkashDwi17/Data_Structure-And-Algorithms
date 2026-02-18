package PracticeSet1;

// 🔟 Subarray Sum Equals K
// Input:
// nums = [1,1,1]
// k = 2
// Output:
// 2

// Because subarrays:
// [1,1] (index 0–1)
// [1,1] (index 1–2)

import java.util.HashMap;

public class _10SubarraySumEqualsK {

public static int subarraySum(int[] nums, int k) {

    HashMap<Integer, Integer> map = new HashMap<>();

    map.put(0, 1);   // base case

    int currentSum = 0;
    int count = 0;

    for (int i = 0; i < nums.length; i++) {

        currentSum += nums[i];

        if (map.containsKey(currentSum - k)) {
            count += map.get(currentSum - k);
        }

        map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
    }

    return count;
}

    public static void main(String[] args) {

        int[] nums = {1,1,1};
        int k = 2;

        System.out.println(subarraySum(nums, k));
    }
}
