package PrefixSumSuffixSum;
import java.util.*;

// Problem 1: Construct Prefix Sum Array

// Company: TCS, Infosys
// Input: arr = [1, 2, 3, 4]
// Output: prefix = [1, 3, 6, 10]
// Idea: prefix[i] = prefix[i-1] + arr[i]

// Optimized code below

// ITS TIME COMPLEXITY IS O(n) and SPACE COMPLEXITY IS O(n)
public class ConstructPrefixSumArray {
    public static List<Integer> constructPrefixSumArray (int arr[]){
        ArrayList <Integer> pref = new ArrayList<>();
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
            pref.add(sum);
        }
        return pref;
    }

    // ITS TIME COMPLEXITY IS O(n) and SPACE COMPLEXITY IS O(1)
    public static void pref1(int arr[]){
 
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
            arr[i] = sum;
        }
        for (int i=0; i<arr.length; i++){
            System.out.print (arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println(constructPrefixSumArray(arr));
    }
}
