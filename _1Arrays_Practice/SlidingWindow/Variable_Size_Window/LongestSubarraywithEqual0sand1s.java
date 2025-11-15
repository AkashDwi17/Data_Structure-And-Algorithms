package SlidingWindow.Variable_Size_Window;
import java.util.*;

// 2.7 Longest Subarray with Equal 0s and 1s
// 📌 Company: TCS, Infosys, Paytm
// Input: [0,0,1,0,1,1,0]
// Output: 6


public class LongestSubarraywithEqual0sand1s {

    public static void longestSubarraywithEqual0sand1s(int arr[]) {
        // Replace 0s with -1s
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }

        // HashMap to store prefix sum and its first occurrence index
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // prefix sum 0 before array starts

        int prefixSum = 0;
        int maxLen = 0;
        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // If prefixSum seen before, update maxLen
            if (map.containsKey(prefixSum)) {
                int length = i - map.get(prefixSum);
                if (length > maxLen) {
                    maxLen = length;
                    start = map.get(prefixSum) + 1;
                    end = i;
                }
            } else {
                // Store first occurrence of this prefixSum
                map.put(prefixSum, i);
            }
        }

        System.out.println("Length of longest subarray with equal 0s and 1s: " + maxLen);
        System.out.print("Subarray: [");
        for (int i = start; i <= end; i++) {
            System.out.print((arr[i] == -1 ? 0 : 1) + (i < end ? ", " : ""));
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 0, 1, 1, 0};
        longestSubarraywithEqual0sand1s(arr);
    }
}

