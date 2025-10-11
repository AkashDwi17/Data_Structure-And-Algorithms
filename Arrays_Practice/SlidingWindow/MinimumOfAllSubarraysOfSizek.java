package SlidingWindow;
import java.util.*;

// 1.5 Minimum of All Subarrays of Size k
// Input: arr = [2, 1, 3, 4, 6, 3, 8, 9, 10, 12, 56], k = 4
// Output: [1, 1, 3, 3, 3, 3, 8, 9]

public class MinimumOfAllSubarraysOfSizek {
    public static List<Integer> minimumOfAllSubarraysOfSize(int arr[], int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();  // store indices, not values
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            //  Remove elements that are out of this window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            //  Remove smaller elements (they’ll never be the max)
            // while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
            //     dq.removeLast();
            // }

            //  Remove smaller elements (they’ll never be the max)
            while (!dq.isEmpty() && arr[dq.peekLast()] >= arr[i]) {
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
        int arr[] = {2, 1, 3, 4, 6, 3, 8, 9, 10, 12, 56};
        int k = 3;

        System.out.println(minimumOfAllSubarraysOfSize(arr, k));
    }
}
