import java.util.*;
public class Main {
    public static void main (String args[]){
        int arr[] = {1,1,2,3,4,4,4};

        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;

        for (int i = 0; i<arr.length; i++){
            if (arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }else if (arr[i] < largest && arr[i] > secLargest){
                secLargest = arr[i];
            }
        }
        System.out.println(secLargest);
    }
}