package SlidingWindow;
import java.util.*;

// 1.7 Sum of All Subarrays of Size k
// Input: arr = [1,2,3,4,5], k = 3
// Output: [6,9,12]

public class SumOfAllSubarraysOfSizek {
    public static List <Integer> sumOfAllSubarrays (int arr[], int k){
        List <Integer> list = new LinkedList<>();
        int sum = 0;
        // list.add(sum);
        for (int i=0; i<k; i++){
            sum += arr[i];
        }
        
        list.add (sum);
        for (int i=k; i<arr.length; i++){
            sum = sum-arr[i-k] + arr[i];
            list.add (sum);
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(sumOfAllSubarrays(arr, 3));
    }
}
