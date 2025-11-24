import java.util.*;
public class Main {
    public static int countSubArrayDivByk (int arr[], int k){
        HashMap <Integer, Integer> map = new HashMap<>();
        map.put (0, 1);
        int sum = 0;
        int count = 0;

        for (int i=0; i<arr.length; i++){
            sum += arr[i];
            int rem = sum % k;
            if (rem < 0){
                rem += k;
            }
            if (map.containsKey(rem)){
                count += map.get(rem);
            }
            if (map.containsKey(rem)){
                map.put (rem, map.get(rem)+1);
            }
            else{
                map.put (rem, 1);
            }
        }
        return count;
    }
    public static void main (String args[]){
        int arr[] = {4,5,0,-2,-3,1};
        System.out.println(countSubArrayDivByk(arr, 5));
    }
}