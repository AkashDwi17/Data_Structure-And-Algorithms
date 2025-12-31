package HashingBased_7;

// 3️⃣ Count Frequency of Each Element

// Return map of element → frequency.

// Input: [1,2,2,3,3,3]
// Output: {1:1, 2:2, 3:3}
import java.util.*;

public class _3CountFrequencyofEachElement {
    public static void countFrequency(int arr[]){
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for (Integer key : map.keySet()){
            System.out.print (map.get(key)+":" + key + "  ");
            // System.out.print (key);
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3};
        countFrequency(arr);
    }
}
