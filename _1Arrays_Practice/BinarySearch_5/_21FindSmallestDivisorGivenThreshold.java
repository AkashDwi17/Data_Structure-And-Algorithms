package BinarySearch_5;

// Problem 21 — Find Smallest Divisor Given Threshold (LeetCode 1283)

// Companies: Amazon
// Input: nums=[1,2,5,9], threshold=6
// Output: 5

public class _21FindSmallestDivisorGivenThreshold {
    
    private static boolean isValid(int[] nums, int divisor, int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor; // equivalent to ceil(num/divisor)
        }
        return sum <= threshold;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = 0;
        for (int num : nums) {
            high = Math.max(high, num);
        }
        
        int answer = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isValid(nums, mid, threshold)) {
                answer = mid; // feasible, try smaller
                high = mid - 1;
            } else {
                low = mid + 1; // not feasible, need larger divisor
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums, threshold)); // 5
    }
}
