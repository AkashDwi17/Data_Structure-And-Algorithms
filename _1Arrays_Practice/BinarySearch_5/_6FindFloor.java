package BinarySearch_5;

// Problem 7 — Find Floor (largest ≤ X)

// Input: arr = [1,2,4,6], x = 5
// Output: 4

public class _6FindFloor {

    public static int floor(int arr[], int x){
        int si = 0, ei = arr.length - 1;
        int ans = -1;

        while (si <= ei){
            int mid = si + (ei - si) / 2;

            if (arr[mid] <= x){
                ans = arr[mid];   // possible floor
                si = mid + 1;     // try to find a larger one
            }
            else {
                ei = mid - 1;     // move left
            }
        }
        return ans; // returns -1 if no floor exists
    }

    public static void main(String[] args){
        int arr[] = {1,2,4,6};
        System.out.println(floor(arr, 5)); // Output: 4
    }
}

