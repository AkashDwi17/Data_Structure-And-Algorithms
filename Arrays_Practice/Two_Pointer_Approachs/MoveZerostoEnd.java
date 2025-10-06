package Two_Pointer_Approachs;
// Move Zeros to End
// Input: [0,1,0,3,12]
// Output: [1,3,12,0,0]
public class MoveZerostoEnd {
    public static void moveZeroToEnd (int arr[]){
        int j = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        } 
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        moveZeroToEnd(arr);
    }
}
