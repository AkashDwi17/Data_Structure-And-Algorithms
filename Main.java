import java.util.*;
public class Main{
    public static int search (int arr[], int si, int ei, int key){
        if (si > ei){
            return -1;
        }
        
            int mid = si + (ei-si)/2;

            if (arr[si] <= arr[mid]){

                if (arr[mid] == key){
                    return mid;
                }

                if  (arr[si] <= key && key <= arr[mid]){
                    return search (arr, si, mid-1, key);
                }else{
                    return search (arr, mid+1, ei, key);
                }
            }else{
                if (key >= mid+1 && key <= ei){
                    return search (arr, mid+1, ei, key);
                }else{
                    return search (arr, si, mid-1, key);
                }
        }
    }
    public static void main (String args[]){
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 0, arr.length-1, 4));
        System.out.println();

        System.out.println(search(arr, 0, arr.length-1, 5));
        System.out.println();

        System.out.println(search(arr, 0, arr.length-1, 6));
        System.out.println();

        System.out.println(search(arr, 0, arr.length-1, 7));
        System.out.println();

        System.out.println(search(arr, 0, arr.length-1, 0));
        System.out.println();

        System.out.println(search(arr, 0, arr.length-1, 1));
        System.out.println();

        System.out.println(search(arr, 0, arr.length-1, 2));
        System.out.println();
    }
}