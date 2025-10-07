package SlidingWindow;
import java.util.*;

// 1.2 First Negative Number in Every Window of Size k
// Input: arr = [12, -1, -7, 8, -15, 30, 16, 28], k = 3
// Output: [-1, -1, -7, -15, -15, 0]

public class FirstNegativeNumber {
    public static void findFirstNegativeNumber(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();  // store indices of negative numbers

        int i = 0, j = 0;

        while (j < arr.length) {
            // Step 1: If current element is negative, add its index
            if (arr[j] < 0) {
                dq.addLast(j);
            }

            // Step 2: Check if window size < k
            if ((j - i + 1) < k) {
                j++;
            }
            // Step 3: When window hits size k
            else if ((j - i + 1) == k) {
                // The first negative number in current window
                if (!dq.isEmpty()) {
                    result.add(arr[dq.peekFirst()]);
                } else {
                    result.add(0);
                }

                // Step 4: Slide the window
                // Remove the index which goes out of window
                if (!dq.isEmpty() && dq.peekFirst() == i) {
                    dq.removeFirst();
                }

                i++;
                j++;
            }
        }

        // Print the result
        System.out.println(result);
    }

    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        findFirstNegativeNumber(arr, k);
    }
}
