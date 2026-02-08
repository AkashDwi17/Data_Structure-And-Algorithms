package Two_Pointer_Approachs;
import java.util.*;

// i/p {0,0,1,1,1,2,2,3,3,4}
// o/p {0 0 1 1 2 2 3 3 4}
public class AllowMax2Occurrences {
    public static void max2Occ (int arr[]){

        Arrays .sort (arr);
        int i = 0;
        for (int j=0; j<arr.length; j++){
            if (i < 2 || arr[j] != arr[i-2]){
                arr[i] = arr[j];
                i++;
            }
        }
        for (int k=0; k<i; k++){
            System.out.print(arr[k]+" ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        max2Occ(arr);
        
    }
}
