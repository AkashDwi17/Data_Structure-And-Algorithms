package HashingBased_7;

// 5️⃣ Top K Frequent Elements / Strings

// Find K most frequent.

// Input: nums=[1,1,1,2,2,3], k=2
// Output: [1,2]
import java.util.*;

public class _5TopKFrequentElements {
    public static ArrayList<Integer> TopKFreqEle (int arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            map.put (arr[i], map.getOrDefault (arr[i], 0)+1);
        } 
        for (Integer key : map.keySet()){
            if (map.get(key) >= 2){
                list.add(key);
                // System.out.print (key);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3};
        System.out.print (TopKFreqEle(arr));
    }
}
