package BinarySearch_5;

// Problem 2 — First Occurrence (Lower Bound)

// Companies: Amazon, Microsoft
// Statement: Find first index where arr[i] == target (or lower_bound).
// Input: arr = [1,2,2,2,3], target = 2
// Output: 1

public class _2FirstOccurrence {
    public static int firstOccurrence (int arr[], int target){
        int si = 0;
        int ei = arr.length-1;
        int ans = -1;

        while (si <= ei){
            int mid = si+(ei-si)/2;
            if (arr[mid] == target){
                ans = mid;
                ei = mid-1;
            }
            else if (arr[mid] < target){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3};
        System.out.println(firstOccurrence(arr, 2));
    }
}
