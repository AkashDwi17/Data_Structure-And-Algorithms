package BinarySearch_5;

// Problem 26 — Find First Bad Version (LeetCode 278)

// Companies: Microsoft
// Statement: Binary to find transition point in boolean predicate.
// Input: versions 1..n, suppose first bad=4; output 4.

public class _26FindFirstBadVersion {
    
    static int firstBad = 4; // simulate first bad version

    public static boolean isBadVersion(int version) {
        return version >= firstBad;
    }

    public static int firstBadVersion(int n) {
        int left = 1, right = n;
        int ans = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                ans = mid;       // potential first bad
                right = mid - 1; // check left side
            } else {
                left = mid + 1;  // move right
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(firstBadVersion(n)); // Output: 4
    }
}
