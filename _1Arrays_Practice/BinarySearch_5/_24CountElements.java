package BinarySearch_5;

// 🔢 4. Count / Frequency / Boundary Variants
// Problem 24 — Count of elements ≤ X (use upper_bound)

// Input: arr=[1,2,4,4,5], X=4
// Output: 4

// Explanation 

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



/*
    ✅ Example 1 — From the question
arr = [1, 2, 4, 4, 5], X = 4


Elements ≤ 4 are:

1, 2, 4, 4  → count = 4

How binary search works:

mid points to elements ≤ 4 → move right

mid points to 5 (greater than 4) → update ans = 4

stop

✔ Output: 4

✅ Example 2 — X smaller than all elements
arr = [10, 20, 30], X = 5


No element ≤ 5.

So output = 0.

Steps:

mid elements > 5 → ans always set to 0

final ans = 0

✔ Output: 0

✅ Example 3 — X larger than all elements
arr = [2, 5, 8, 10], X = 20


All elements ≤ 20.

So count = arr.length = 4

Steps:

arr[mid] ≤ X → always move right

ans remains = 4

✔ Output: 4

✅ Example 4 — X matches only some elements
arr = [1, 2, 2, 3, 3, 5], X = 3


Elements ≤ 3:

1, 2, 2, 3, 3 → count = 5


✔ Output: 5

✅ Example 5 — Duplicate boundary (important)
arr = [1, 1, 1, 1, 1], X = 1


All elements ≤ 1.

Binary search never finds arr[mid] > X
so ans stays = arr.length = 5.

✔ Output: 5

✅ Example 6 — X between two values
arr = [2, 4, 6, 8], X = 5


Elements ≤ 5:

2, 4 → count = 2


Binary search finds first element > 5 is 6 at index 2.

✔ Output: 2

✅ Example 7 — Negative values
arr = [-10, -5, -2, 0, 3], X = -3


Elements ≤ -3:

-10, -5 → count = 2


First element > -3 is -2 at index 2.

✔ Output: 2

✅ Example 8 — Mixed numbers
arr = [1, 3, 3, 7, 9], X = 6


Elements ≤ 6:

1, 3, 3 → count = 3


First > 6 is 7 at index 3.

✔ Output: 3

⭐ Summary Table
arr	X	Elements ≤ X	Count
[1,2,4,4,5]	4	1,2,4,4	4
[10,20,30]	5	(none)	0
[2,5,8,10]	20	2,5,8,10	4
[1,2,2,3,3,5]	3	1,2,2,3,3	5
[1,1,1,1,1]	1	all 1s	5
[2,4,6,8]	5	2,4	2
[-10,-5,-2,0,3]	-3	-10,-5	2
[1,3,3,7,9]	6	1,3,3	3

If you want, I can also provide:

✔ Dry-run tables for each example
✔ Diagram explanation of upper_bound
✔ Lower_bound + upper_bound combined code
✔ Reverse-sorted array variant

*/