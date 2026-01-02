package HashingBased_7;

// 6️⃣ Contains Duplicate

// Check any number appears at least twice.

// Input: [1,2,3,1]
// Output: true

import java.util.*;

public class _6ContainsDuplicate {
    public static boolean  containsDublicate(int arr[]){
        HashSet <Integer> set = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            if (set.contains(arr[i])){
                return true;
            }else{
                set.add (arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.print (containsDublicate(arr));
    }
}
