import java.util.*;
public class Main {
    public static List <Integer> master (int arr[]){
        List <Integer> list = new ArrayList<>();
        int n = arr.length;
        list.add (arr[n-1]);

        int max = arr[n-1];

        for (int i=arr.length-2; i>=0; i--){
            if (arr[i] > max){
                max = arr[i];
                list.add (arr[i]);
            }
        }
        return list;
    }
    public static void main (String args[]){
        int arr[] = {6,3,5,2,4,0};  
        System.out.println(master(arr));
    }
}


