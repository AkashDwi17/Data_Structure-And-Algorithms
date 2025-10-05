package Arrays_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIndices4 {
    public static List<List<Integer>> uniquePairSum (int arr[], int target){
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

        int si = 0;
        int ei = arr.length-1;
        
        while (si <= ei){
            if (arr[si] + arr[ei] == target){
                List<Integer>pair = new ArrayList<>();
                pair.add (arr[si]);
                pair.add (arr[ei]);
                result.add(pair);
            }
            if (arr[si] + arr[ei] < target){
                si ++;
            }else{
                ei --;
            }
        }
        return result;
    }
    public static void main (String args[]){
        int arr[] = {2, 4, 3, 5, 7, -1, 0};
        int target = 6;
        List<List<Integer>> pairs = uniquePairSum(arr, target);
        System.out.println(pairs);
    }
}
