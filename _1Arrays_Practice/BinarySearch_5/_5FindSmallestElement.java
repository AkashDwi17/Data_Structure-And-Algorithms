package BinarySearch_5;

// Problem 6 — Find Smallest Element ≥ X (ceiling)

// Input: arr = [1,2,4,6], x = 3
// Output: 4

public class _5FindSmallestElement {

    public static int ceiling(int arr[], int x){
        int si = 0, ei = arr.length - 1;
        int ans = -1;

        while (si <= ei){
            int mid = si + (ei - si) / 2;

            if (arr[mid] >= x){
                ans = arr[mid];  // possible ceiling
                ei = mid - 1;    // try to find smaller valid element
            }
            else {
                si = mid + 1;    // move right
            }
        }
        return ans; // returns -1 if no ceiling exists
    }

    public static void main(String[] args){
        int arr[] = {1,2,4,6};
        System.out.println(ceiling(arr, 3)); // Output: 4
    }
}
