package BinarySearch_5;

// Problem 13 — Search in Nearly Sorted Array (each element can be at i-1,i,i+1)

// Companies: some interviews
// Input: arr = [10,3,40,20,50,80,70], target=40
// Output: 2 (handle swapped positions)

public class _13SearchNearlySortedArray {

    public static int search(int[] arr, int target) {
        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            // Check mid
            if (arr[mid] == target) return mid;

            // Check mid - 1 (if valid)
            if (mid - 1 >= si && arr[mid - 1] == target) return mid - 1;

            // Check mid + 1 (if valid)
            if (mid + 1 <= ei && arr[mid + 1] == target) return mid + 1;

            // If target is smaller → go left
            if (target < arr[mid]) {
                ei = mid - 2;
            } 
            // Otherwise target is greater → go right
            else {
                si = mid + 2;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 3, 40, 20, 50, 80, 70};
        int target = 40;
        System.out.println(search(arr, target));  // Output: 2
    }
}
