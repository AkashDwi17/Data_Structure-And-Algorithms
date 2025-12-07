package SORTINGBASEDPROBLEMS_6;
import java.util.*;

// 1. 2Sum (Sorted + Two Pointers)
// 📌 Problem:
// Given a sorted array, find two numbers that sum to a target.
// Input: arr = [1,2,3,4,6], target=6
// Output: [1,3]
// Companies: Amazon, Google

public class _1_2Sum {
    public static ArrayList <ArrayList<Integer>> _2Sum (int arr[], int target){
        ArrayList <ArrayList<Integer>> list = new ArrayList<>();
        int si = 0;
        int ei = arr.length-1;

        while (si < ei){
            if (arr[si] + arr[ei] == target){
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add (si);
                ans.add (ei);
                list.add (ans);
                si ++;
                ei --;  
            }
            else if (arr[si]+arr[ei] < target){
                si ++;
            }else{
                ei --;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,6};
        System.out.println(_2Sum(arr, 6));
    }
}
