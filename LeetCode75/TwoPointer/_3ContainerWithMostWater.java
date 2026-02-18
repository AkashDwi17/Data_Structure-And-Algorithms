package LeetCode75.TwoPointer;
import java.util.*;

// Input: height = [1,8,6,2,5,4,8,3,7]
// Output: 49
// Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

public class _3ContainerWithMostWater {
    public static int containerWithMostWater (int arr[]){
        int lp = 0;
        int rp = arr.length-1;
        int maxWater = 0;
        while (lp < rp){
            int ht = Math.min (arr[lp], arr[rp]);
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(currWater, maxWater);
            
            if (lp < rp){
                lp ++;
            }else{
                rp --;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater(arr));
    }
}
