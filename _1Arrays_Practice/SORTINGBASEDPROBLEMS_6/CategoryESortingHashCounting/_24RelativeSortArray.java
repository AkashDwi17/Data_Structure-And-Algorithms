package SORTINGBASEDPROBLEMS_6.CategoryESortingHashCounting;

/*
24. Relative Sort Array
🔥 Concept:

Sort arr1 based on order in arr2.

Input
arr1 = [2,3,1,3,2,4,6,7,9,2,19]
arr2 = [2,1,4,3,9,6]

Output
[2,2,2,1,4,3,3,9,6,7,19] */


import java.util.*;

public class _24RelativeSortArray {

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {

        // Step 1: Frequency count of arr1
        int max = 0;
        for (int num : arr1) {
            max = Math.max(max, num);
        }

        int[] count = new int[max + 1];
        for (int num : arr1) {
            count[num]++;
        }

        // Step 2: Output array
        int[] result = new int[arr1.length];
        int idx = 0;

        // Step 3: First place numbers in the order of arr2
        for (int num : arr2) {
            while (count[num] > 0) {
                result[idx++] = num;
                count[num]--;
            }
        }

        // Step 4: Place remaining numbers (in natural sorted order)
        for (int num = 0; num <= max; num++) {
            while (count[num] > 0) {
                result[idx++] = num;
                count[num]--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr1[] = {2,3,1,3,2,4,6,7,9,2,19};
        int arr2[] = {2,1,4,3,9,6};

        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
        // Output: [2,2,2,1,4,3,3,9,6,7,19]
    }
}
