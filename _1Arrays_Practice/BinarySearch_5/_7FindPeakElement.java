package BinarySearch_5;

// Problem 8 — Find Peak Element (element > neighbors) (LeetCode 162)

// Companies: Google, Amazon
// Input: arr = [1,2,1]
// Output: 1 (index of 2)

// Explanation

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




/*
    ⭐ Algorithm Reminder (Your Code)

If
arr[mid] < arr[mid + 1] → Go Right (peak lies on the right slope)

Else
→ Go Left (peak lies on the left or at mid)

Loop stops when si == ei → that index is the peak.

✅ Example 1 — Simple Mountain
arr = [1, 3, 5, 4, 2]

We expect peak = 5 (index 2)

Step-by-Step:
si	ei	mid	arr[mid]	arr[mid+1]	Move
0	4	2	5	4	arr[mid] > arr[mid+1] → go left
0	2	1	3	5	arr[mid] < arr[mid+1] → go right
2	2	-	-	-	STOP
✔ Result → Peak at index 2
✅ Example 2 — Peak at Start
arr = [9, 5, 4, 2, 1]

Peak = 9 (index 0)

si	ei	mid	arr[mid]	arr[mid+1]	Move
0	4	2	4	2	go left
0	2	1	5	4	go left
0	1	0	9	5	go left
0	0	-	-	-	STOP
✔ Peak at 0
✅ Example 3 — Peak at End
arr = [1, 2, 3, 4, 8]

Peak = 8 (index 4)

si	ei	mid	arr[mid]	arr[mid+1]	Move
0	4	2	3	4	go right
3	4	3	4	8	go right
4	4	-	-	-	STOP
✔ Peak at 4
✅ Example 4 — Multiple Peaks
arr = [1, 3, 2, 4, 3]

Two peaks:

3 at index 1

4 at index 3

Algorithm may return any one.

Step-By-Step:

si	ei	mid	arr[mid]	arr[mid+1]	Move
0	4	2	2	4	go right
3	4	3	4	3	go left
3	3	-	-	-	STOP
✔ Peak returned = 3 (value = 4)
✅ Example 5 — Zig-Zag Pattern
arr = [1, 3, 1, 3, 1]

Two valid peaks: index 1 or 3

Step-By-Step:

si	ei	mid	arr[mid]	arr[mid+1]	Move
0	4	2	1	3	go right
3	4	3	3	1	go left
3	3	-	-	-	STOP
✔ Peak at index 3
✅ Example 6 — All Increasing
arr = [1, 2, 3, 4, 5]

Peak = last element (5)

si	ei	mid	arr[mid]	arr[mid+1]	Move
0	4	2	3	4	go right
3	4	3	4	5	go right
4	4	-	-	-	STOP
✔ Peak = index 4
✅ Example 7 — All Decreasing
arr = [6, 5, 4, 3, 2]

Peak = first element (6)

si	ei	mid	arr[mid]	arr[mid+1]	Move
0	4	2	4	3	go left
0	2	1	5	4	go left
0	1	0	6	5	go left
0	0	-	-	-	STOP
✔ Peak = 0
📌 Why This Works (Important Explanation)

The algorithm relies on the fact that:

➤ If arr[mid] < arr[mid + 1]

You're on an ascending slope, peak must be right.

➤ If arr[mid] > arr[mid + 1]

You're on a descending slope, peak lies on left including mid.

This ensures:

You always move toward a peak

Range gets smaller each step

Eventually si == ei → a peak index

⏱ Time & Space Complexity
Operation	Complexity
Time	O(log n)
Space	O(1)
*/