package SORTINGBASEDPROBLEMS_6;
import java.util.*;

// 4. 4Sum — Quadruplets

// 📌 Problem:
// Find all unique quadruplets that sum to target.

// Input: [1,0,-1,0,-2,2], target=0
// Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]



public class _4Sum {

    public static List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();

        int n = arr.length;

        for (int i = 0; i < n - 3; i++) {

            // avoid duplicate for i
            if (i > 0 && arr[i] == arr[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {

                // avoid duplicate for j
                if (j > i + 1 && arr[j] == arr[j - 1]) continue;

                int si = j + 1;
                int ei = n - 1;

                while (si < ei) {
                    long sum = 1L * arr[i] + arr[j] + arr[si] + arr[ei];

                    if (sum == target) {
                        res.add(Arrays.asList(arr[i], arr[j], arr[si], arr[ei]));

                        si++;
                        ei--;

                        // skip duplicates for si
                        while (si < ei && arr[si] == arr[si - 1]) si++;

                        // skip duplicates for ei
                        while (si < ei && arr[ei] == arr[ei + 1]) ei--;

                    } else if (sum < target) {
                        si++;
                    } else {
                        ei--;
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, -1, 0, -2, 2};
        int target = 0;

        System.out.println(fourSum(arr, target));
    }
}

