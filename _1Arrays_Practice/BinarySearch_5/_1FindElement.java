package BinarySearch_5;


// Problem 1 — Standard Binary Search (Find element)

// Companies: All (basic)
// Statement: Find index of target in sorted array (return -1 if not present).
// Input: arr = [1,2,3,4,5,6], target = 4
// Output: 3 (0-based)

// Edge: not found → -1.

import java.util.*;
public class _1FindElement {
    public static int findElement (int arr[], int target){
        int si = 0;
        int ei = arr.length-1;
        while (si <= ei){
            int mid = si+(ei-si)/2;
            if (arr[mid] == target){
                return mid;
            }

            if (arr[mid] <  target){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.print(findElement(arr, 4));
    }
}
