import java.util.*;

public class RemovingDuplicates {
    public static void removeDublicateUsingaMap(int arr[]){
        HashSet <Integer> set = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            set.add (arr[i]);
        }

        // Case:1 o/p 1 2 3

        // for (Integer val : set){
        //     System.out.print(val);
        // }

        // Case: 2 o/p [1, 2, 3]
        Integer result [] = set.toArray(new Integer[0]);
        
        System.out.print(Arrays.toString(result));
        
    }

    public static void removeDublicateUsingArray (int arr[]){
        Arrays.sort(arr);
        System.out.print(arr[0]+" ");
        for (int i=1; i<arr.length; i++){
            if (arr[i] != arr[i-1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3};
        removeDublicateUsingArray(arr);
        // removeDublicateUsingaMap(arr);
    }
}
