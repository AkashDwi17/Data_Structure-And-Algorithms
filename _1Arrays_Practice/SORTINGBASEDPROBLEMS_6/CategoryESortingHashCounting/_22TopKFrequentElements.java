package SORTINGBASEDPROBLEMS_6.CategoryESortingHashCounting;


// 22. Top K Frequent Elements
// 🔥 Concept:

// Return elements that appear most frequently.

// ✔ Approach

// Count → sort by freq → take top K

// Input
// nums = [1,1,1,2,2,3], k = 2

// Output
// [1,2]

import java.util.*;

public class _22TopKFrequentElements {

    public static int[] topKFrequent(int[] nums, int k) {
        
        // Step 1: Build frequency map
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create buckets (index = frequency)
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Step 3: Fill buckets
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();
            buckets[frequency].add(number);
        }

        // Step 4: Collect top K frequent elements
        int[] result = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            for (int num : buckets[i]) {
                result[index++] = num;
                if (index == k) break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
        // Output: [1, 2]
    }
}

