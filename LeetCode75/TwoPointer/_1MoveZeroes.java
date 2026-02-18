package LeetCode75.TwoPointer;

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]

public class _1MoveZeroes {
    public static void moveZeroes (int arr[]){
        int i = 0;
        for (int j=0; j<arr.length; j++){
            if (arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }
    public static void print (int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print (arr[i]+" ");
        }
        System.out.println ();
    }
    public static void main (String args[]){
        int arr[] = {0,1,0,3,12};
        print(arr);
        moveZeroes(arr);
        print(arr);
    }
}
