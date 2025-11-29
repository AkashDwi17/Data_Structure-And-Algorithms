package BinarySearch_5;


// Problem 18 — Painter’s Partition Problem

// Companies: Coding challenge / interviews
// Statement: Minimize time to paint using painters, binary on time limit.
// Input: boards=[10,20,30,40], painters=2
// Output: 60

public class _18PaintersPartitionProblem {

    // Greedy check: can we paint all boards using at most 'painterCount' painters
    // if each painter can paint at most 'maxTime' units?
    private static boolean canPaintWithinTime(int[] boards, int painterCount, long maxTime) {
        int usedPainters = 1;
        long currentTime = 0;

        for (int length : boards) {
            if (currentTime + length <= maxTime) {
                currentTime += length;          // assign board to current painter
            } else {
                usedPainters++;                 // need another painter
                currentTime = length;           // this board assigned to new painter
                if (usedPainters > painterCount) return false; // not feasible
            }
        }
        return true; // feasible within painterCount
    }

    // Binary-search on time: find minimum maximum time per painter
    public static int minTimeToPaint(int[] boards, int painterCount) {
        long lowerBound = 0;  // max single board
        long upperBound = 0;  // sum of all boards

        for (int b : boards) {
            lowerBound = Math.max(lowerBound, b);
            upperBound += b;
        }

        long bestTime = upperBound;

        while (lowerBound <= upperBound) {
            long midTime = lowerBound + (upperBound - lowerBound) / 2;

            if (canPaintWithinTime(boards, painterCount, midTime)) {
                bestTime = midTime;       // feasible — try smaller time
                upperBound = midTime - 1;
            } else {
                lowerBound = midTime + 1; // not feasible — need more time
            }
        }

        return (int) bestTime;
    }

    // demo
    public static void main(String[] args) {
        int[] boards = {10, 20, 30, 40};
        int painters = 2;
        System.out.println(minTimeToPaint(boards, painters)); // prints 60
    }
}
