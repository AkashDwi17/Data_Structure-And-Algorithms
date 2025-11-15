package Two_Pointer_Approachs;
import java.util.*;

public class FindIndices3 {
    public static List<List<Integer>> findAllPairs(int arr[], int target) {
        int si = 0;
        int ei = arr.length - 1;
        List<List<Integer>> result = new ArrayList<>();

        while (si < ei) {

            if (arr[si] + arr[ei] == target) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[si]);
                pair.add(arr[ei]);
                result.add(pair);
                si++;
                ei--;
            } else if (arr[si] + arr[ei] < target) {
                si++;
            } else {
                ei--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6};
        int target = 5;

        List<List<Integer>> pairs = findAllPairs(arr, target);

        System.out.println(pairs);
    }
}
