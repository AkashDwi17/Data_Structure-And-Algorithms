package PracticeSet1;

// 🟢 24️⃣ Kth Largest Element in Array
// Input:
// [3,2,1,5,6,4]
// k = 2
// Output:
// 5
// Because sorted array:
// [1,2,3,4,5,6]
// 2nd largest = 5
import java.util.PriorityQueue;

public class _11KthLargestElementInArray {

    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {

            minHeap.add(nums[i]);

            if (minHeap.size() > k) {
                minHeap.poll();   // remove smallest
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        System.out.println(findKthLargest(nums, k));
    }
}
