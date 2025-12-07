package SORTINGBASEDPROBLEMS_6;

// 9. Meeting Rooms I

// 📌 Problem: Check if a person can attend all meetings.

// Input: [[0,30],[5,10],[15,20]]
// Output: false

import java.util.Arrays;

public class _9MeetingRooms1 {

    public static boolean canAttendMeetings(int[][] intervals) {
        if (intervals.length == 0) return true;

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Step 2: Check for overlaps
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                // Current meeting starts before previous ends → overlap
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] intervals = {{0,30},{5,10},{15,20}};
        System.out.println(canAttendMeetings(intervals)); // Output: false
    }
}
