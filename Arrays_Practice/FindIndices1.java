package Arrays_Practice;

public class FindIndices1 {
    public static boolean find  (int arr[], int target){
        int si = 0;
        int ei = arr.length-1;
        while (si < ei){
            if (arr[si] + arr[ei] == target){
                return true;
            }
            if (arr[si] + arr[ei] < target){
                si++;
            }else{
                ei--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6};
        System.out.println(find(arr, 5));
    }
}
