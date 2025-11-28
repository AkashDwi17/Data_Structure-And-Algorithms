package BinarySearch_5;

// Problem 10 — Find Minimum in Rotated Sorted Array (with duplicates) (LeetCode 154)

// Input: arr = [2,2,2,0,1,2]
// Output: 0


public class _10MinimumInRotatedSortedArrayWithDuplicates {

    public static int findMin(int[] arr) {
        int si = 0;
        int ei = arr.length - 1;

        while (si < ei) {
            int mid = si + (ei - si) / 2;

            if (arr[mid] > arr[ei]) {
                // min is in right half
                si = mid + 1;
            } else if (arr[mid] < arr[ei]) {
                // min is in left half including mid
                ei = mid;
            } else {
                // arr[mid] == arr[ei] -> cannot decide, shrink right bound
                ei = ei - 1;
            }
        }

        // si == ei -> minimum element
        return arr[si];
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 2, 0, 1, 2};
        System.out.println(findMin(arr1)); // 0

        int[] arr2 = {1, 1, 1, 1}; // all equal
        System.out.println(findMin(arr2)); // 1

        int[] arr3 = {3, 4, 5, 1, 2}; // normal rotated
        System.out.println(findMin(arr3)); // 1

        int[] arr4 = {1}; // single element
        System.out.println(findMin(arr4)); // 1
    }
}
