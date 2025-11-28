package BinarySearch_5;

// Problem 4 — Count Occurrences (using bounds)

// Companies: Interview tests
// Input: arr = [1,2,2,2,3], target = 2
// Output: 3

public class _4CountOccurrences {
    // First occurrence
    public static int firstOccurrence(int arr[], int key){
        int si = 0, ei = arr.length - 1, ans = -1;
        while (si <= ei){
            int mid = si + (ei - si) / 2;
            if (arr[mid] == key){
                ans = mid;
                ei = mid - 1; // go left
            } 
            else if (arr[mid] < key){
                si = mid + 1;
            } 
            else {
                ei = mid - 1;
            }
        }
        return ans;
    }

    // Last occurrence
    public static int lastOccurrence(int arr[], int key){
        int si = 0, ei = arr.length - 1, ans = -1;
        while (si <= ei){
            int mid = si + (ei - si) / 2;
            if (arr[mid] == key){
                ans = mid;
                si = mid + 1; // go right
            } 
            else if (arr[mid] < key){
                si = mid + 1;
            } 
            else {
                ei = mid - 1;
            }
        }
        return ans;
    }

    // Count occurrences
    public static int countOccurrences(int arr[], int key){
        int first = firstOccurrence(arr, key);
        if (first == -1) return 0; // key not present
        int last = lastOccurrence(arr, key);
        return last - first + 1;
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 2, 2, 3};
        System.out.println(countOccurrences(arr, 2)); // Output: 3
    }
}
