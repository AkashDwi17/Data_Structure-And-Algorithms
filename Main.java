import java.util.*;
public class Main{
    public static int maxSubArraySum (int arr[]){
        int noDelete = arr[0];
        int oneDelete = arr[0];
        int ans = arr[0];

        for (int i=1; i<arr.length; i++){
            oneDelete = Math.max (noDelete, oneDelete+arr[i]);
            noDelete = Math.max (arr[i], noDelete+arr[i]);
            ans = Math.max (ans, Math.max (oneDelete, noDelete));
        } 
        return ans;
    }
    public static void main (String args[]){
        int arr[] = {1,-2,0,3};
        System.out.println(maxSubArraySum(arr));
    }
}