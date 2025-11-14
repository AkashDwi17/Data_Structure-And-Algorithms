package DSA_LAB_TEST;
import java.util.*;


public class ReverseArray {


    public static void printArr (int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print (arr[i]+" ");
        }
    }



    public static void reverse (int arr[]){
        int si = 0;
        int ei = arr.length-1;

        while (si < ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            
            si ++;
            ei --;
        }
    }

    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        printArr(arr);
        reverse(arr);
        System.out.println();
        printArr(arr);
    }
}
