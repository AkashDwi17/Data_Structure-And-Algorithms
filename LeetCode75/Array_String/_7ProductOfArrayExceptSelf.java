package LeetCode75.Array_String;

// Example 1:

// Input: nums = [1,2,3,4]
// Output: [24,12,8,6]      
// Example 2:

// Input: nums = [-1,1,0,-3,3]
// Output: [0,0,9,0,0]
import java.util.*;

public class _7ProductOfArrayExceptSelf {
    public static int[] productOfArrayExceptSelf (int arr[]){
        int pref[] = new int [arr.length];
        int suff[] = new int [arr.length];

        pref[0] = 1;
        suff[arr.length-1] = 1;

        for (int i=1; i<pref.length; i++){
            pref[i] = pref[i-1] * arr[i-1];
        }

        for (int i=arr.length-2; i>=0; i--){
            suff[i] = suff[i+1] * arr[i+1];
        }

        for (int i=0; i<arr.length; i++){
            arr[i] = pref[i] * suff[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(Arrays.toString(productOfArrayExceptSelf(arr)));
    }
}
