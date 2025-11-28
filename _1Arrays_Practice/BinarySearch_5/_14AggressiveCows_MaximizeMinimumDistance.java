package BinarySearch_5;
import java.util.*;

// Problem 14 — Aggressive Cows / Maximize minimum distance (binary on distance)

// Companies: SPOJ/Codeforces style contests
// Statement: Place C cows in stalls to maximize minimum distance between cows.
// Input: stalls=[1,2,4,8,9], C=3
// Output: 3 (place at 1,4,8 → min dist=3)

public class _14AggressiveCows_MaximizeMinimumDistance {
    
    // check if it's possible to place C cows with at least 'd' distance
    private static boolean canPlace(int[] stalls, int C, int d) {
        int count = 1;                // place first cow at stalls[0]
        int lastPos = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= d) {
                count++;
                lastPos = stalls[i];
                if (count == C) return true;
            }
        }
        return false;
    }

    // main binary-search-on-distance routine
    public static int maxMinDistance(int[] stalls, int C) {
        Arrays.sort(stalls);
        int si = 0;
        int ei = stalls[stalls.length - 1] - stalls[0]; // maximum possible distance
        int best = 0;

        while (si <= ei) {
            int mid = si + (ei - si) / 2; // candidate minimum distance
            if (canPlace(stalls, C, mid)) {
                best = mid;         // mid is feasible, try larger
                si = mid + 1;
            } else {
                ei = mid - 1;       // mid not feasible, try smaller
            }
        }
        return best;
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int C = 3;
        System.out.println(maxMinDistance(stalls, C)); // prints 3
    }
}
