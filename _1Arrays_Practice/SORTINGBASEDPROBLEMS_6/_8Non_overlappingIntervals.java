package SORTINGBASEDPROBLEMS_6;

// 8. Non-overlapping Intervals

// 📌 Problem:
// Minimum intervals to remove to make all intervals non-overlapping.

// Input: [[1,2],[2,3],[3,4],[1,3]]
// Output: 1

import java.util.*;

public class _8Non_overlappingIntervals {

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) return 0;

        // Step 1: Sort intervals by end time
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        int count = 0; // number of intervals to remove
        int end = intervals[0][1];

        // Step 2: Iterate through intervals
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                // Overlap found, remove current interval
                count++;
            } else {
                // No overlap, update end
                end = intervals[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals)); // Output: 1
    }
}
