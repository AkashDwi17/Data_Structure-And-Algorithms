package SlidingWindow.Variable_Size_Window;

// 2.5 Smallest Subarray with Sum ≥ K
// 📌 Company: Amazon, Adobe
// Input: [2,3,1,2,4,3], k = 7
// Output: 2 ([4,3])


public class SmallestSubarraywithSumGreaterEqualToK {

    // Method to find smallest subarray with sum >= k
    public static void smallestSubarraywithSumGreaterEqualToK(int[] arr, int k) {
        int start = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        int subarrayStart = 0; // To store start of smallest subarray

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end]; // expand window

            // Shrink window from left while sum >= k
            while (sum >= k) {
                if (end - start + 1 < minLength) {
                    minLength = end - start + 1;
                    subarrayStart = start; // record start index
                }
                sum -= arr[start]; // remove start element
                start++;           // move start pointer
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            System.out.println("No subarray has sum ≥ " + k);
        } else {
            System.out.println("Length of smallest subarray with sum ≥ " + k + ": " + minLength);
            System.out.print("Subarray: [");
            for (int i = subarrayStart; i < subarrayStart + minLength; i++) {
                System.out.print(arr[i]);
                if (i != subarrayStart + minLength - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int k = 7;

        // Call the method
        smallestSubarraywithSumGreaterEqualToK(arr, k);
    }
}
