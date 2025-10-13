package PrefixSumSuffixSum;
import java.util.*;

// Problem 1: Construct Prefix Sum Array

// Company: TCS, Infosys
// Input: arr = [1, 2, 3, 4]
// Output: prefix = [1, 3, 6, 10]
// Idea: prefix[i] = prefix[i-1] + arr[i]

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
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        System.out.println(constructPrefixSumArray(arr));
    }
}
