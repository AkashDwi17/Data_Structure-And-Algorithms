import java.util.*;
public class Main {
    public static int LongestSubArraySum (int arr[], int k){
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxLength = 0;

        while (right < arr.length){
            sum += arr[right];
            while (sum > k && left <= right){
                sum -= arr[left];
                left ++;
            }
            if (sum == k){
                maxLength = Math.max(maxLength, right-left + 1);
            }
            right ++;
        }
        return maxLength;
    }
    public static void main (String args[]){
        int arr[] = {};
    }
}