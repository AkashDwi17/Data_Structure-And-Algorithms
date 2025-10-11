package SlidingWindow;
import java.util.*;

// 1.6 Average of All Subarrays of Size k
// Input: arr = [1, 3, 2, 6, -1, 4, 1, 8, 2], k = 5
// Output: [2.2, 2.8, 2.4, 3.6, 2.8]

public class AverageOfAllSubarraysOfSizek {
    public static List<Double> averageOfAllSubarrays(int arr[], int k) {
        List<Double> list = new ArrayList<>();
        double sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        list.add(sum / k);

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            list.add(sum / k);
        }

        return list;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        System.out.println(averageOfAllSubarrays(arr, 5));
    }
}