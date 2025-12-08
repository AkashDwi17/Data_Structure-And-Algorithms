import java.util.*;
public class Main {
    public static int findMid (int arr[]){
        int totalSum = 0;
        for (int i=0; i<arr.length; i++){
            totalSum += arr[i];
        }
        int leftSum = 0;
        for (int i=0; i<arr.length-1; i++){
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main (String args[]){
        int arr[] = {1,3,5,2,2};
        System.out.println(findMid(arr));
    }
}