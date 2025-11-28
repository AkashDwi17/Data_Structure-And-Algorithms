package BinarySearch_5;

// Problem 15 — Capacity to Ship Packages Within D Days (LeetCode 1011)

// Companies: Amazon
// Statement: Minimum ship capacity to ship weights in ≤ D days (binary on capacity).
// Input: weights=[1,2,3,4,5,6,7,8,9,10], D=5
// Output: 15

public class _15CapacityToShipPackagesWithinDDays {

    // check if capacity 'cap' can ship all weights within D days
    private static boolean canShip(int[] weights, int D, int cap) {
        int days = 1;
        int current = 0;
        for (int w : weights) {
            if (current + w <= cap) {
                current += w;
            } else {
                days++;
                current = w; // start new day with this package
                if (days > D) return false; // early exit
            }
        }
        return true;
    }

    public static int shipWithinDays(int[] weights, int D) {
        int lo = 0;
        int hi = 0;
        for (int w : weights) {
            lo = Math.max(lo, w); // at least the heaviest package
            hi += w;
        }

        int ans = hi;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (canShip(weights, D, mid)) {
                ans = mid;
                hi = mid - 1; // try smaller capacity
            } else {
                lo = mid + 1; // need larger capacity
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int D = 5;
        System.out.println(shipWithinDays(weights, D)); // Output: 15
    }
}
