package PrefixSumSuffixSum;

// Problem 4: Find Pivot Index (LeetCode 724)

// Company: Google, Amazon
// Input: [1,7,3,6,5,6]
// Output: 3
// Explanation: Left sum (11) = Right sum (11) at index 3



// Problem 5: Equilibrium Index

// Company: TCS, Accenture, Infosys
// Statement: Find an index such that sum of left part = sum of right part.
// Input: [1,3,5,2,2]
// Output: 2


public class FindPivotIndex {
    public static int findMidIdx (int arr[]){
        int totalSum = 0;
        for (int i=0; i<arr.length; i++){
            totalSum += arr[i];
        }
        int leftSum = 0;
        for (int i=0; i<arr.length-1; i++){
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum){
                return i;
            } 
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,7,3,6,5,6};
        System.out.println(findMidIdx(arr));
    }
}
