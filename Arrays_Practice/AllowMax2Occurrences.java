package Arrays_Practice;
import java.util.*;

public class AllowMax2Occurrences {
    public static void max2Occ (int arr[]){
        Arrays.sort (arr);
        int i = 0;
        for (int j=0; j<arr.length; j++){
            while (arr[j] > 0){
                arr[i] = j;
                i++;
                arr[j]--;
            }
        }
    }
    public static void print (int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print (arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        max2Occ(arr);
        print(arr);
    }
}
