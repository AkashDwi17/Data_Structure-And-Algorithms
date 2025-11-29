package BinarySearch_5;

// Problem 27 — Find Boundaries in 2D Monotone Matrix (search in matrix II)

// Companies: LeetCode/Contests
// Statement: Use binary split on rows/columns or staircase search.

public class _27FindBoundariesIn2DMonotoneMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1; // start top-right

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--; // move left
            } else {
                row++; // move down
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10,13,14,17}
        };
        int target = 5;
        System.out.println(searchMatrix(matrix, target)); // true
    }
}
