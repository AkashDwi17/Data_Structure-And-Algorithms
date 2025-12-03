package Sorting_Algorithm;

// Bubble Sort
// Large Elements comes to the end of array by swapping the adjacent elements to the end of array

public class BubbleSort {
    public static void print (int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print (arr[i]+" ");
        }
        System.out.println();
    }
    public static void bubbleSort (int arr[]){
        for (int i=0;  i<=arr.length-1; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main (String args[]){
        int arr[] = {5,4,1,3,2};
        print(arr);

        bubbleSort(arr);
        print(arr);
    }
}