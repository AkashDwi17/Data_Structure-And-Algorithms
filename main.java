import java.util.*;
public class Main {

    public static List<List<Integer>> print (int arr[], int target){
        List<List<Integer>> result = new ArrayList<>();

        int si = 0;
        int ei = arr.length-1;

        while (si < ei){
            if (arr[si] + arr[ei] == target){
                List<Integer>pair = new ArrayList<>();
                pair.add(arr[si]);
                pair.add(arr[ei]);
                result.add(pair);
            }

            if (arr[si] + arr[ei] < target){
                si++;
            }else{
                ei --;
            }
            return result;
        }
    }
    public static void main (String args[]){
        int arr[] = {1, 2, 3, 4, 6};
        
        List<List<Integer>> pairs = print(arr, 5);
    }
}