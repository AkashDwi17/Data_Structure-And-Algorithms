package BinarySearch_5;

// Problem 3 — Last Occurrence (Upper Bound - 1)

// Companies: Amazon, Google
// Input: arr = [1,2,2,2,3], target = 2
// Output: 3

public class _3LastOccurrence {

    public static int lastOccurrence(int arr[], int target) {
        int si = 0;
        int ei = arr.length - 1;
        int ans = -1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            if (arr[mid] == target) {
                ans = mid;
                si = mid + 1; // go right
            }
            else if (arr[mid] < target) {
                si = mid + 1;
            }
            else {
                ei = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 3};
        System.out.println(lastOccurrence(arr, 2)); // Output: 3
    }
}
