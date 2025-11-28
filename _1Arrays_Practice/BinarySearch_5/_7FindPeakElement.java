package BinarySearch_5;

// Problem 8 — Find Peak Element (element > neighbors) (LeetCode 162)

// Companies: Google, Amazon
// Input: arr = [1,2,1]
// Output: 1 (index of 2)

public class _7FindPeakElement {

    public static int findPeak(int arr[]) {
        int si = 0, ei = arr.length - 1;

        while (si < ei) {
            int mid = si + (ei - si) / 2;

            // If mid element is smaller than right neighbor,
            // then peak is in the right half
            if (arr[mid] < arr[mid + 1]) {
                si = mid + 1;
            } 
            else {
                // Peak is on the left side (including mid)
                ei = mid;
            }
        }

        return si;  // or ei (both same)
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1};
        System.out.println(findPeak(arr)); // Output: 1
    }
}

