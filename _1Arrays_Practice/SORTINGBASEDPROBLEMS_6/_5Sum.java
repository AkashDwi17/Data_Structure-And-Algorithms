package SORTINGBASEDPROBLEMS_6;
import java.util.*;

// 5. K-Sum Generalized

// 📌 Problem:
// Find all unique combinations of K numbers summing to target.

// Used in Coding contests.

public class _5Sum {

    public static List<List<Integer>> kSum(int[] nums, int target, int k) {
        Arrays.sort(nums);
        return kSumHelper(nums, target, k, 0);
    }

    private static List<List<Integer>> kSumHelper(int[] nums, int target, int k, int start) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        // Base Case → reduce to 2-sum (two pointers)
        if (k == 2) {
            int si = start, ei = n - 1;

            while (si < ei) {
                int sum = nums[si] + nums[ei];

                if (sum == target) {
                    res.add(Arrays.asList(nums[si], nums[ei]));

                    si++;
                    ei--;

                    // skip duplicates
                    while (si < ei && nums[si] == nums[si - 1]) si++;
                    while (si < ei && nums[ei] == nums[ei + 1]) ei--;

                } else if (sum < target) {
                    si++;
                } else {
                    ei--;
                }
            }
            return res;
        }

        // Recursive K-Sum
        for (int i = start; i < n - k + 1; i++) {

            // skip duplicate fixed number
            if (i > start && nums[i] == nums[i - 1]) continue;

            // Reduce K → K-1
            List<List<Integer>> temp = kSumHelper(nums, target - nums[i], k - 1, i + 1);

            // Add current number to all found combinations
            for (List<Integer> t : temp) {
                List<Integer> comb = new ArrayList<>();
                comb.add(nums[i]);
                comb.addAll(t);
                res.add(comb);
            }
        }

        return res;
    }

    // Demo
    public static void main(String[] args) {

        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;

        System.out.println("4-Sum Combinations:");
        System.out.println(kSum(arr, target, 4));

        System.out.println("\n3-Sum Combinations:");
        System.out.println(kSum(arr, target, 3));
    }
}

