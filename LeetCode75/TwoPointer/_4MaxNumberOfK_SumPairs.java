package LeetCode75.TwoPointer;

// Input: nums = [1,2,3,4], k = 5
// Output: 2

// Input: nums = [3,1,3,4,3], k = 6
// Output: 1


public class _4MaxNumberOfK_SumPairs {
    public static int maxNumberOfK_SumPairs (int arr[], int k){
        int lp = 0;
        int rp = arr.length-1;
        int count  = 0;
        while (lp < rp){
            int sum = arr[lp] + arr[rp];
            if (sum == k){
                count ++;
                lp ++;
                rp --;
            }
            else if (sum < k){
                lp ++;
            }else{
                rp --;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(maxNumberOfK_SumPairs(arr, 5));
    }
}


// Input: nums = [1,2,3,4], k = 5
// Output: 2
// Explanation: Starting with nums = [1,2,3,4]:
// - Remove numbers 1 and 4, then nums = [2,3]
// - Remove numbers 2 and 3, then nums = []
// There are no more pairs that sum up to 5, hence a total of 2 operations.
// Example 2:

// Input: nums = [3,1,3,4,3], k = 6
// Output: 1
// Explanation: Starting with nums = [3,1,3,4,3]:
// - Remove the first two 3's, then nums = [1,4,3]
// There are no more pairs that sum up to 6, hence a total of 1 operation.


