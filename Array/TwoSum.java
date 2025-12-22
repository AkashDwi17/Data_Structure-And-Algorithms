package Array;
import java.util.*;

// 1. 2Sum (Sorted + Two Pointers)
// 📌 Problem:
// Given a sorted array, find two numbers that sum to a target.
// Input: arr = [1,2,3,4,6], target=6
// Output: [1,3]

 
public class TwoSum {
    public static ArrayList<ArrayList<Integer>> twoSum (int arr[], int target){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int si = 0;
        int ei = arr.length-1;
        while (si < ei){
            ArrayList<Integer> ans = new ArrayList<>();
            if (arr[si] + arr[ei] == target){
                ans.add (arr[si]);
                ans.add (arr[ei]);
                list.add (ans);
            }
            if (arr[si] + arr[ei] < target){
                si ++;
            }else{
                ei --;
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6};
        System.out.print (twoSum(arr, 6));
    }
}
