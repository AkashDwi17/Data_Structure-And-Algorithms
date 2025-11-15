package SlidingWindow;
import java.util.*;

// 1.4 Maximum of All Subarrays of Size k
// (Deque-based sliding window max)
// Input: arr = [1,3,-1,-3,5,3,6,7], k = 3
// Output: [3,3,5,5,6,7]


public class MaximumOfAllSubarraysOfSizek {
    public static List<Integer> maxOfAllSubarrays(int arr[], int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();  // store indices, not values
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            //  Remove elements that are out of this window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            //  Remove smaller elements (they’ll never be the max)
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.removeLast();
            }

            //  Add current element’s index
            dq.addLast(i);

            //  If we have a full window, record the max
            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
            
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println(maxOfAllSubarrays(arr, k));
    }
}
