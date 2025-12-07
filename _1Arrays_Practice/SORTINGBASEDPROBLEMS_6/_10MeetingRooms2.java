package SORTINGBASEDPROBLEMS_6;


// 10. Meeting Rooms II

// 📌 Problem:
// Minimum number of rooms needed.

// Input: [[0,30],[5,10],[15,20]]
// Output: 2

import java.util.Arrays;
import java.util.PriorityQueue;

public class _10MeetingRooms2 {

    public static int minMeetingRooms(int[][] intervals) {
        if (intervals.length == 0) return 0;

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Step 2: Min-heap to track end times
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(intervals[0][1]); // First meeting ends at intervals[0][1]

        // Step 3: Iterate through remaining meetings
        for (int i = 1; i < intervals.length; i++) {
            // If earliest ending meeting ends before current starts, reuse room
            if (intervals[i][0] >= minHeap.peek()) {
                minHeap.poll();
            }
            // Allocate room for current meeting
            minHeap.add(intervals[i][1]);
        }

        // Number of rooms = size of heap
        return minHeap.size();
    }

    public static void main(String[] args) {
        int[][] intervals = {{0,30},{5,10},{15,20}};
        System.out.println(minMeetingRooms(intervals)); // Output: 2
    }
}
