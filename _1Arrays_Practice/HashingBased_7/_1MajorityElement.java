package HashingBased_7;
import java.util.*;

// 1️⃣ Majority Element (Moore’s Voting + Hashing)

// Find element occurring more than n/2 times.

// Input: [3,2,3]
// Output: 3

public class _1MajorityElement {
    
    public static void majorityElement (int arr[]){

        int n = arr.length;
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for (Integer key : map.keySet()){
            if (map.get(key) > n/2){
                System.out.print (key+" ");
            }
            System.out.println ();
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,2,3};
        majorityElement(arr);
    }
}
