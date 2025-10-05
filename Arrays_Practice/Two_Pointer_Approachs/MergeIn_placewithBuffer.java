package Two_Pointer_Approachs;

// Input: [1,2,3,0,0,0], [2,5,6]
// Output: [1,2,2,3,5,6]
import java.util.*;

public class MergeIn_placewithBuffer {
    public static void merge3 (int nums1[], int nums2[]){
        ArrayList <Integer> list = new ArrayList<>();
        for (int i=0; i<nums1.length && nums1[i] != 0; i++){           
            list.add(nums1[i]);           
        }

        for (int i=0; i<nums2.length && nums2[i] != 0; i++){
            list.add(nums2[i]);
        }
        Collections.sort (list);
        System.out.println (list);
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        merge3(nums1, nums2);
    }
}
