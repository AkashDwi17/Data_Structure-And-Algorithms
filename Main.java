
import java.util.*;

public class Main {

    public static void max2Occ(int arr[]) {
        Arrays.sort(arr); // Must sort first

        int i = 0; // position to write

        for (int j = 0; j < arr.length; j++) {
            // If i < 2, always write
            // Otherwise, compare with arr[i - 2] to allow max 2 occurrences
            if (i < 2 || arr[j] != arr[i - 2]) {
                arr[i] = arr[j];
                i++;
            }
        }

        // Print the valid part
        for (int k = 0; k < i; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        max2Occ(arr);
    }
}
 