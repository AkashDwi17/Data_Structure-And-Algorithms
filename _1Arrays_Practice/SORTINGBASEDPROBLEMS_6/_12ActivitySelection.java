package SORTINGBASEDPROBLEMS_6;

// 12. Activity Selection

// 📌 Problem:
// Select maximum non-overlapping activities.

import java.util.Arrays;
import java.util.Comparator;

public class _12ActivitySelection {

    public static int maxActivities(int[] start, int[] end) {
        int n = start.length;

        // Pair activities: [start, end]
        int[][] activities = new int[n][2];
        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = end[i];
        }

        // Sort activities by ending time
        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));

        int count = 1; // first activity is always selected
        int lastEnd = activities[0][1];

        for (int i = 1; i < n; i++) {
            if (activities[i][0] > lastEnd) { // no overlap
                count++;
                lastEnd = activities[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        System.out.println(maxActivities(start, end)); // Output: 4
    }
}
