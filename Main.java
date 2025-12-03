import java.util.*;
public class Main{

    public static void print (int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println ();
    }
    public static void mergeSort (int arr[], int si, int ei){
        if (si >= ei){
            return;
        }
        int mid = si+(ei-si)/2;
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
        while (i <= mid){
            temp[k++] = arr[i++];
        }
        while (j <= ei){
            temp[k++] = arr[j++];
        }
        for (k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
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
        int piviot = arr[ei];
        int i = si-1;
        for (int j=si; j<ei; j++){
            if (arr[j] < piviot){
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
    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        print(arr);
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}