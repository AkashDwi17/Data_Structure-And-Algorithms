package BinarySearch_5;

// Problem 12 — Find Rotation Count (index of min)

// Input: arr = [15,18,2,3,6,12]
// Output: 2 (min at index 2 → rotated 2 times)


public class _12FindRotationCount {

    public static int findRotationCount(int arr[]) {
        int si = 0;
        int ei = arr.length - 1;

        // If already sorted → rotation count = 0
        if (arr[si] <= arr[ei]) return 0;

        while (si <= ei) {
            int mid = si + (ei - si) / 2;

            // Check if mid is the minimum element
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid;
            }

            // If right half is sorted, go left
            if (arr[mid] <= arr[ei]) {
                ei = mid - 1;
            } else {
                // left half sorted, go right
                si = mid + 1;
            }
        }
        return 0; // fallback (shouldn’t reach)
    }

    public static void main(String[] args) {
        int arr[] = {15, 18, 2, 3, 6, 12};
        System.out.println(findRotationCount(arr));  // Output: 2
    }
}
