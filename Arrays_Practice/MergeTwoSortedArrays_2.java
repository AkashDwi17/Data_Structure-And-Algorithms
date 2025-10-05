package Arrays_Practice;

import java.util.*;
// Input: [1,3,5], [2,4,6]
// Output: [1,2,3,4,5,6]

// MergeTwoSortedArrays_2.java

public class MergeTwoSortedArrays_2 {
    public static void merge2Array (int nums1[], int nums2[]){
        int k = 0;
        int i = 0;
        List <Integer> list = new ArrayList<>();
        while (i<nums1.length || i<nums2.length){
            if (i<nums1.length){
                list.add(nums1[i]);
            }
            if (i<nums2.length){
                list.add(nums2[i]);
            }
            i++;
        }
        System.out.println (list);
    }
    public static void main(String[] args) {
        int nums1[] = {1,3,5,100,99,98,97,96,95,94};
        int nums2[] = {2,4,6,7,8};
        merge2Array(nums1, nums2);
    }
}
