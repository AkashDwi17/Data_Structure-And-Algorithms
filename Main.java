import java.util.*;
public class Main {
    
    public static void print (int arr[]){
        for (int i = 0; i<arr.length; i++){
            System.out.print (arr[i]+" ");
        }
    }

    // Bubble Sort
    public static void bubbleSort (int arr[]){
        for (int i=0; i<arr.length; i++){
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
    public static void selectionSort (int arr[]){
        for (int i=0; i<arr.length-1; i++){
            int minPos = 0;
            for (int j=i; j<arr.length; j++){
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
    public static void insertionSort (int arr[]){
        for (int i=0; i<arr.length; i++){
            int prev = i-1;
            int curr = arr[i];
            while (prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev --;
            }
            arr[prev+1] = curr;
        }
    }
    public static void main (String args[]){
        
    }
}


