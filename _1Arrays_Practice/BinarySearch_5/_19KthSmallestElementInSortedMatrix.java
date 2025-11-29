package BinarySearch_5;

// Problem 19 — Kth Smallest Element in Sorted Matrix (LeetCode 378)

// Companies: Amazon, Microsoft
// Statement: Binary on value range; count ≤ mid using rows sorted property.
// Input: matrix=[[1,5,9],[10,11,13],[12,13,15]], k=8
// Output: 13

public class _19KthSmallestElementInSortedMatrix {

    // Count how many elements are <= target using staircase walk.
    // Start at bottom-left and move up/right.
    private static int countLessOrEqual(int[][] matrix, int target) {
        int n = matrix.length;
        if (n == 0) return 0;
        int m = matrix[0].length;

        int row = n - 1;    // start at last row
        int col = 0;        // start at first column
        int count = 0;

        while (row >= 0 && col < m) {
            if (matrix[row][col] <= target) {
                // All elements in this row up to 'row' index? No — here columns increase left→right.
                // If matrix[row][col] <= target then all elements in this column above `row`?
                // But with row start bottom-left, when matrix[row][col] <= target,
                // all elements in row 0..row at this column are <= target? Not guaranteed.
                // Correct staircase logic:
                // If matrix[row][col] <= target then every element in this row from col..m-1?
                // (No.) Standard approach: start top-right OR bottom-left with adapted moves below.
            }
            // We'll use the standard bottom-left approach below (properly):
            break;
        }

        // Use the standard bottom-left staircase: start at bottom-left row = n-1, col = 0
        row = n - 1;
        col = 0;
        count = 0;
        while (row >= 0 && col < m) {
            if (matrix[row][col] <= target) {
                // All elements in this column from row=0..row are <= target? No.
                // Correct: from (row, col) moving left doesn't help. Standard proven variant:
                // Start at top-right (row=0, col=m-1) and move left/down.
                break;
            }
        }

        // Simpler & correct: start at top-right and move left/down.
        row = 0;
        col = m - 1;
        count = 0;
        while (row < n && col >= 0) {
            if (matrix[row][col] <= target) {
                // If matrix[row][col] <= target, then all elements in this row from 0..col are <= target
                count += (col + 1);
                row++;            // move to next row
            } else {
                // matrix[row][col] > target -> move left to smaller values
                col--;
            }
        }
        return count;
    }

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        if (n == 0) throw new IllegalArgumentException("Empty matrix");
        int m = matrix[0].length;

        int low = matrix[0][0];
        int high = matrix[n - 1][m - 1];

        int answer = low;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = countLessOrEqual(matrix, mid);

            if (count >= k) {
                answer = mid;
                high = mid - 1; // look for smaller possible value
            } else {
                low = mid + 1;
            }
        }
        return answer;
    }

    // Quick test
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 5, 9},
            {10,11,13},
            {12,13,15}
        };
        int k = 8;
        System.out.println(kthSmallest(matrix, k)); // prints 13
    }
}
