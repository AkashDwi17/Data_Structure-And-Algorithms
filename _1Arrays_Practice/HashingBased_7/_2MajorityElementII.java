package HashingBased_7;

// 2️⃣ Majority Element II

// Elements occurring more than n/3 times.

// Input: [3,2,3,2,2,1,1]
// Output: [2]

import java.util.*;
public class _2MajorityElementII {
    public static void MajorityElement (int arr[]){
        int n = arr.length;
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            map.put (arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for (Integer key : map.keySet()){
            if (map.get(key) > n/3){
                System.out.print (key+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,3,2,2,1,1};
        MajorityElement(arr);
    }
}
