package Arrays_Practice;
// Two Pointers Technique – Array Problem-Solving

// =========================================================================

// Problem 1.1: Find if Pair Exists with Given Sum

// Statement: Given a sorted array and a target, check if two numbers add up to target.
// Input: arr = [1, 2, 3, 4, 6], target = 6
// Output: True (2 + 4 = 6)

import java.util.*;
public class Pair_Sum {
    public static boolean existPair (int arr[], int target){
        int si = 0;
        int ei = arr.length-1;

        while (si < ei){
            if (arr[si] + arr[ei] == target){
                System.out.print(arr[si] + ", " + arr[ei]+" ");
                
                return true;
            }
            if (arr[si] + arr[ei] < target){
                si ++;
            } else{
                ei --;
            }
        }
        return false;
    }



    public static void main (String args[]){
        int arr[] = {1, 2, 3, 4, 6};
        System.out.println(existPair(arr, 6));
    }
}