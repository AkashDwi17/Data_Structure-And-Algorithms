package Arrays_Practice;
import java.util.*;
// Input: [1,3,5], [2,4,6]
// Output: [1,2,3,4,5,6]

public class MergeTwoSortedArrays {
    public static void merge2Array (int nums1[], int nums2[]){
        List <Integer> list = new ArrayList<>();
        for (int i=0; i<nums1.length; i++){
            list.add(nums1[i]);
        }
        for (int i=0; i<nums2.length; i++){
            list.add (nums2[i]);
        }
        Collections.sort (list);
        System.out.println (list);
    }
    public static void main(String[] args) {
        int nums1[] = {1,3,5};
        int nums2[] = {2,4,6};
        merge2Array(nums1, nums2);
    }
}
