package Sorting_Algorithm;

public class QuickSort {

    public static void print (int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSort (int arr[], int si, int ei){

        if (si >= ei){
            return;
        }
        int pIdx = partition (arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    public static int partition (int arr[], int si, int ei){
        int pivoit = arr[ei];
        int i = si-1;
        for (int j=si; j<ei; j++){
            if (arr[j] < pivoit){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        // int temp = pivoit;
        // arr[ei] = arr[i];
        // arr[i] = temp;

        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = {5,1,4,3,2};
        print(arr);
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}
