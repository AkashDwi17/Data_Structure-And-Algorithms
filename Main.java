import java.util.*;

// Statement: Given an array and queries (L, R), find sum of elements from L to R using prefix sum.
// Input: arr = [1, 2, 3, 4, 5], query = (2, 4)
// Output: 9 (2 + 3 + 4 = 9)

public class Main {
    public static void rangeSumQuery (int arr[], int left, int right){
        int sum = 0;
        for (int i=left-1; i<right; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
    public static void main (String args[]){
        int arr[] = {1, 2, 3, 4, 5};
        rangeSumQuery(arr, 2, 4);
    }
}