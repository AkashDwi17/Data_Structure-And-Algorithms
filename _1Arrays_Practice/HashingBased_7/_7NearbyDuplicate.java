package HashingBased_7;

// 7️⃣ Nearby Duplicate

// |i - j| ≤ k and arr[i] == arr[j]

// Input: nums=[1,2,3,1], k=3
// Output: true

import java.util.*;

public class _7NearbyDuplicate {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // If number already seen
            if (map.containsKey(nums[i])) {

                int previousIndex = map.get(nums[i]);

                // Check distance condition
                if (i - previousIndex <= k) {
                    return true;
                }
            }

            // Update latest index
            map.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;

        System.out.println(containsNearbyDuplicate(nums, k)); // true
    }
}
