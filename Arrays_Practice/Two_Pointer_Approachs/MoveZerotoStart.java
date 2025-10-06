package Two_Pointer_Approachs;

// 5.2 Sort 0s, 1s, 2s (Dutch Flag)
// Input: [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]

public class MoveZerotoStart {
    public static void setZeroInFront (int arr[]){
        int i = arr.length-1;;
        for (int j=arr.length-1; j>=0; j--){
            if (arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i--;
            }
        }
    }
    public static void print (int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print (arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        print(arr);
        setZeroInFront(arr);
        System.out.println();
        print(arr);
    }
}
