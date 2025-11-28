package BinarySearch_5;

// Problem 9 — Find Minimum in Rotated Sorted Array (no duplicates) (LeetCode 153)

// Companies: Amazon, Microsoft
// Input: arr = [4,5,6,7,0,1,2]
// Output: 0

public class _8MinimumInRotatedSortedArray {

    public static int findMin(int[] arr) {
        int si = 0, ei = arr.length - 1;

        while (si < ei) {
            int mid = si + (ei - si) / 2;

            // If mid element is greater than the last element,
            // the minimum is in the right half
            if (arr[mid] > arr[ei]) {
                si = mid + 1;
            }
            else {
                // Minimum is in left half, including mid
                ei = mid;
            }
        }

        return arr[si]; // at the end si == ei, pointing to minimum element
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(findMin(arr)); // Output: 0
    }
}
