    import java.util.*;
    
    public class SecondLargest {
    public static void main (String args[]){
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;


        int arr[] = {1, 2, 3, 4, 4, 4};

        for (int i=0; i<arr.length; i++){
            if (arr[i] > largest){
                secLargest = largest;
                largest = arr[i];
            }else if (arr[i] < largest && arr[i] > largest){
                secLargest = arr[i];
            }
        }
        System.out.println(secLargest);
    }
}

