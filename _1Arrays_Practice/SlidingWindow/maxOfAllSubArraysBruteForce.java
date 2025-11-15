package SlidingWindow;
import java.util.*;
    // Input: arr = [1,3,-1,-3,5,3,6,7], k = 3
    // Output: [3,3,5,5,6,7]
public class maxOfAllSubArraysBruteForce {
    public static List<Integer> maxOfAllSubarrays(int arr[], int k) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= arr.length - k; i++) {
            int maxNum = arr[i];
            for (int j = i; j < i + k; j++) {
                maxNum = Math.max(maxNum, arr[j]);
            }
            list.add(maxNum);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(maxOfAllSubarrays(arr, k)); // [3, 3, 5, 5, 6, 7]
    }
}


    

    

