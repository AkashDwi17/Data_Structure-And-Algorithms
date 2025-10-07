import java.util.*;

public class Main {
    public static List<Integer> countDistinctElements (int arr[], int k){
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<k; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        result.add (map.size());


        // slide
        for (int i=k; i<arr.length; i++){
            int leaving = arr[i-k];
            map.put(leaving, map.get(leaving)-1);
            if (map.get(leaving) == 0){
                map.remove(leaving);
            }

            int entering = arr[i];
            map.put(entering, map.getOrDefault(entering, 0)+1);
            result.add(map.size());
        }
        return result;
    }

       public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        System.out.println(countDistinctElements(arr, k));
        
    }
}
