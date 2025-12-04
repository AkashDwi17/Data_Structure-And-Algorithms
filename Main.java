import java.util.*;
public class Main {

    public static void print (int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print (arr[i]+" ");
        }
        System.out.println();
    }

    // Bubble sort
    // Large Element come to the end of array by swapping the adjacent element

    public static void bubbleSort (int arr[]){
        for (int i=0; i<arr.length-1; i++){
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
    // pick an element from the unsorted part and put it at begining

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
    // Pick an element from the unsorted part and put it at its write position

    public static void insertionSort (int arr[]){
        for (int i=0; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev > 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    // Counting Sort
    public static void countingSort (int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int [largest+1];
        for (int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int i = 0;
        for (int j=0; j<arr.length; j++){
            while (count[j] > 0){
                count[i] = j;
                i++;
                count [j] --;
            }
        }
    }

    // Merge Sort 
    public static void mergeSort (int arr[], int si, int ei){
        if (si >= ei){
            return;
        }
        int mid  = si+(ei-si)/2;
        mergeSort (arr, si, mid);
        mergeSort (arr, mid+1, ei);
        merge (arr, si, mid, ei);
    }

    public static void merge (int arr[], int si, int mid, int ei){
        int temp[] = new int [ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while (i <= mid && j <= ei){
            if (arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i<=si){
            temp[k++] = arr[i++];
        }
        while (j<=ei){
            temp[k++] = arr[j++];
        }
        for (k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    // QuickSort
    public static void quickSort (int arr[], int si, int ei){
        if (si >= ei){
            return;
        }
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    public static int partition (int arr[], int si, int ei){
        int i = si-1;
        int pivoit = arr[ei];
        for (int j=si; j<ei; j++){
            if (arr[j] < pivoit){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;
        return i;
    }

    public static void main (String args[]) {
        int arr[] = {5,4,1,3,2};
        bubbleSort(arr);
        print(arr);

        selectionSort(arr);
        print(arr);

        selectionSort(arr);
        print(arr);

        countingSort(arr);
        print(arr);

        mergeSort(arr, 0, arr.length-1);
        print(arr);

        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}