package Sorting_Algorithm;
import java.util.*;

public class CountingSort {
    public static void countingSort (int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            largest = Math.max (largest, arr[i]);
        }
        int count[] = new int [largest+1];
        for (int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int i = 0;
        for (int j=0; j<count.length; j++){
            while (count[j] > 0){
                arr[i] = j;
                i++;
                count[j] --;
            }
        }
    }
    public static void print (int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print (arr[i]+" ");
        }
    }

    public static void main (String args[]){
        int arr[] = {5,4,1,3,2};
        print(arr);
        countingSort(arr);
        System.out.println();
        print(arr);
    }
}