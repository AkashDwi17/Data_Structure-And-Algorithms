package BinarySearch_5;

// 🔢 4. Count / Frequency / Boundary Variants
// Problem 24 — Count of elements ≤ X (use upper_bound)

// Input: arr=[1,2,4,4,5], X=4
// Output: 4


public class _24CountElements {

    public static int countLessEqual(int[] arr, int X) {
        int si = 0, ei = arr.length - 1;
        int ans = arr.length; // default if all elements ≤ X

        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] > X) {
                ans = mid;
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }

        return ans; // number of elements ≤ X
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5};
        int X = 4;
        System.out.println(countLessEqual(arr, X)); // 4
    }
}
