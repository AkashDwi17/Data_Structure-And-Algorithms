package KADANESALGORITHM;
import java.util.*;


// Problem 2: Maximum Subarray (Return Subarray)

// Company: Amazon, Accolite
// Input: arr = [1,2,3,-2,5]
// Output: [1,2,3,-2,5] (sum=9)


public class MaximumSubarraySum2 {
    public static List <Integer> maximumSubarraySum2 (int arr[]){
        List <Integer> list = new ArrayList<>();
        int currSum = arr[0];
        int maxSum = arr[0];

        int st = 0;
        int end = 0;
        int tempSt = 0;

        for (int i=1; i<arr.length; i++){
            if (currSum + arr[i] < arr[i]){
                currSum = arr[i];
                tempSt = i;
            }
            else{
                currSum += arr[i];
            } 
            maxSum = Math.max(currSum, maxSum);

            if (currSum == maxSum){
                st = tempSt;
                end = i;
            }
        }
        for (int i=st; i<=end; i++){
            list.add(arr[i]);
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,-2,5};
        System.out.println(maximumSubarraySum2(arr));
    }
}
