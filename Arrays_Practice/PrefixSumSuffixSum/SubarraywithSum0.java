package PrefixSumSuffixSum;
import java.util.*;

// Problem 8: Subarray with Sum 0
// Company: Wipro, Infosys, TCS
// Input: [4,2,-3,1,6]
// Output: True ([2,-3,1])

public class SubarraywithSum0 {
    public static boolean subarraywithSum0(int arr[]) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: subarray from 0..i has sum 0
            if (sum == 0) {
                return true;
            }

            // Case 2: if this sum was seen before, 
            // the subarray between them sums to 0
            if (set.contains(sum)) {
                return true;
            }else{
                 set.add(sum);// store current sum
            }   
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, -3, 1, 6};
        System.out.println(subarraywithSum0(arr));
    }
}


/*
 * import java.util.*;
public class Main {
    public static boolean summEqualToZero (int arr[], int k){
        HashSet <Integer> set = new HashSet<>();
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
            if (set.contains(sum)){
                return true;
            }else{
                set.add(sum);
            }
        }
        return false;
    }
    public  static void main (String args[]){
        int arr[] = {4,2,-3,1,6};
        System.out.println(summEqualToZero(arr, 0));
    }
}
 * 
 */