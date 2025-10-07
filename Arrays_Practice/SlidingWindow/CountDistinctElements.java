// 1.3 Count Distinct Elements in Every Window of Size k
// Input: arr = [1, 2, 1, 3, 4, 2, 3], k = 4
// Output: [3, 4, 4, 3]

package SlidingWindow;
import java.util.*;

public class CountDistinctElements {
    public static List<Integer> countDistinctElements(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        // Step 1: Count elements of first window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        result.add(map.size());

        // Step 2: Slide the window
        for (int i = k; i < arr.length; i++) {
            int leaving = arr[i - k]; // element leaving the window
            map.put(leaving, map.get(leaving) - 1);
            if (map.get(leaving) == 0) {
                map.remove(leaving); // remove if count is 0
            }

            int entering = arr[i]; // element entering the window
            map.put(entering, map.getOrDefault(entering, 0) + 1);

            result.add(map.size());
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        System.out.println(countDistinctElements(arr, k));
    }
}
