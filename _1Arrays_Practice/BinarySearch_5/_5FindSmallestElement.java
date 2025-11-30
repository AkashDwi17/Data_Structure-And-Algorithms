package BinarySearch_5;

// Problem 6 — Find Smallest Element ≥ X (ceiling)

// Input: arr = [1,2,4,6], x = 3
// Output: 4

// Explanation 

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


// ✅ Example 1 — Normal Case
// arr = [1, 2, 4, 6]
// x = 5
// output = 6


// Explanation: The smallest element ≥ 5 is 6.

// ✅ Example 2 — Exact Match
// arr = [2, 4, 7, 10]
// x = 4
// output = 4


// Explanation: Ceiling of X is X itself if present.

// ✅ Example 3 — X Smaller Than All Elements
// arr = [5, 8, 12]
// x = 1
// output = 5


// Explanation: First element is the ceiling.

// ✅ Example 4 — X Greater Than All Elements
// arr = [1, 2, 3]
// x = 10
// output = -1


// Explanation: No element ≥ 10 → return -1.

// ✅ Example 5 — With Duplicates
// arr = [2, 2, 2, 3, 5]
// x = 2
// output = 2


// Even with duplicates, binary search works.

// ✅ Example 6 — Ceiling Between Duplicates
// arr = [1, 2, 2, 2, 5]
// x = 3
// output = 5