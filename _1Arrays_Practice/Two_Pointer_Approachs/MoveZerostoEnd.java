package Two_Pointer_Approachs;
// Move Zeros to End
// Input: [0,1,0,3,12]
// Output: [1,3,12,0,0]
public class MoveZerostoEnd {
    public static void moveZeroToEnd (int arr[]){
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
    }
    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        print(arr);
        moveZeroToEnd(arr);
        System.out.println();
        print(arr);
    }
}
