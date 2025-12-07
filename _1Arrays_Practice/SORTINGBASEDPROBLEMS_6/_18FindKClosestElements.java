package SORTINGBASEDPROBLEMS_6;


// 18. Find K Closest Elements
// 🔥 Concept:

// Find k elements closest to x in a sorted array.

// ✔ Approach

// Binary search for left boundary, compare distances.

// Input
// arr = [1,2,3,4,5]
// k = 4
// x = 3

// Output
// [1,2,3,4]

import java.util.*;

public class _18FindKClosestElements {

    public static List<Integer> findKClosestElements(int[] sortedArray, int k, int target) {
        int left = 0;
        int right = sortedArray.length - k; // last possible start index of k elements

        // Binary search to find the best starting index of k closest elements
        while (left < right) {
            int mid = left + (right - left) / 2;

            // Compare distance from target for the edges of the window
            if (target - sortedArray[mid] > sortedArray[mid + k] - target) {
                left = mid + 1; // move window right
            } else {
                right = mid;    // move window left
            }
        }

        // Collect the k closest elements
        List<Integer> closestElements = new ArrayList<>();
        for (int i = left; i < left + k; i++) {
            closestElements.add(sortedArray[i]);
        }

        return closestElements;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int target = 3;

        List<Integer> closest = findKClosestElements(arr, k, target);
        System.out.println(closest); // Output: [1, 2, 3, 4]
    }
}

