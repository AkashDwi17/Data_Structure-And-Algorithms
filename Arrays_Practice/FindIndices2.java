package Arrays_Practice;

// Problem 1.2: Return Indices of Pair with Given Sum

// Input: arr = [1, 2, 3, 4, 6], target = 6
// Output: [1, 3] (2 + 4 = 6, indices start from 0)

import java.util.Arrays;

public class FindIndices2 {
    public static int [] find (int arr[], int target){
        int si = 0;
        int ei = arr.length-1;
        int ans[] = new int [2];
        while (si < ei){
            if (arr[si] + arr[ei] == target){
                ans[0] = arr[si];
                ans[1] = arr[ei];
                return ans;
            }
            if (arr[si] + arr[ei] < target){
                si++;
            }else{
                ei --;
            }
        }
        return new int[]{};
    } 

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6};
        System.out.println(Arrays.toString(find(arr, 6)));
    }
}
