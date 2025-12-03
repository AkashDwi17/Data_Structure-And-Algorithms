import java.util.*;
public class Main{
    public static void print (int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println ();
    }

    // Bubble Sort
    // Large Elements comes to the end of array by swapping the adjacent elements to the end of array

    public static void bubbleSort (int arr[]){

        for (int i = 0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Selection Sort 
    // pick an elements from the unsorted part and put it at the begning

    public static void selectionSort (int arr[]){
        for (int i=0; i<arr.length-1; i++){
            int minPos = i;
            for (int j=i+1; j<arr.length; j++){
                if (arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        } 
    }

    // Insertion Sort

    // Pick an element from the unsorted part and put it at its correct position
    public static void insertionSort (int arr[]){
        for (int i=0; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev --;
            }
            arr[prev+1] = curr;
        }
    }


    public  static void main (String args[]){
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        print(arr);
        selectionSort(arr);
        print(arr);
        insertionSort(arr);
        print(arr);
    }
}