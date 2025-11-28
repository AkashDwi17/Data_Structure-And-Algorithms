import java.util.*;
public class Main {
    public static int lastOcc (int arr[], int target){
        int si = 0;
        int ei = arr.length-1;
        int ans = -1;
        while (si <= ei){
            int mid = si+(ei-si)/2;
            if (arr[mid] == target){
                ans = mid;
                si = mid + 1;
            }
            else if (arr[mid] < target){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        return ans;
    }
    public static void main (String args[]){
        int arr[] = {1,2,2,2,3};
        System.out.println(lastOcc(arr, 2));
    }
}