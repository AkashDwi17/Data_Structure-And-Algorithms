import java.util.*;
public class Main {
    public static boolean summEqualToZero (int arr[], int k){
        HashSet <Integer> set = new HashSet<>();
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i];
            if (set.contains(sum)){
                return true;
            }else{
                set.add(sum);
            }
        }
        return false;
    }
    public  static void main (String args[]){
        int arr[] = {4,2,-3,1,6};
        System.out.println(summEqualToZero(arr, 0));
    }
}