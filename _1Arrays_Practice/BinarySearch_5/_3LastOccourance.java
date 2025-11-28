package BinarySearch_5;

// Problem 3 — Last Occurrence (Upper Bound - 1)

// Companies: Amazon, Google
// Input: arr = [1,2,2,2,3], target = 2
// Output: 3

public class _3LastOccourance {
    public static int lastOccourance (int arr[], int i, int key){
        if (i == arr.length){
            return -1;
        }
        int isFound = lastOccourance(arr, i+1, key);
        if (isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3};
        System.out.println(lastOccourance(arr, 0, 2));
    }
}
