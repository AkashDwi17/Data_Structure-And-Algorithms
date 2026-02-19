package PracticeSet1;

public class _3MaxConsecutiveOnesIII {

    public static int longestOnes(int[] nums, int k) {

        int left = 0;
        int right = 0;
        int maxLen = 0;
        int zeroCount = 0;

        while (right < nums.length) {

            if (nums[right] == 0) {
                zeroCount++;
            }

            // If zeros exceed k → shrink window
            while (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        System.out.println(longestOnes(nums, k));
    }
}
