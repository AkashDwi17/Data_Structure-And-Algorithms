package SORTINGBASEDPROBLEMS_6;

// 3. 3Sum Closest

// 📌 Problem:
// Find triplet sum closest to target.
// Input: arr = [-1,2,1,-4], target=1
// Output: 2

import java.util.*;

public class _3SumClosest {

    public static int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int closest = arr[0] + arr[1] + arr[2]; // initialize with first triplet

        for (int i = 0; i < arr.length - 2; i++) {
            int si = i + 1;
            int ei = arr.length - 1;

            while (si < ei) {
                int sum = arr[i] + arr[si] + arr[ei];

                // update if closer
                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                }

                // move pointers
                if (sum < target) si++;
                else ei--;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int arr[] = {-1, 2, 1, -4};
        int target = 1;

        System.out.println(threeSumClosest(arr, target));  // Output: 2
    }
}

