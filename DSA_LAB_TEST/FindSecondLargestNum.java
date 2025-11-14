package DSA_LAB_TEST;
import java.util.*;

public class FindSecondLargestNum {
    public static int find2ndLargest (Integer nums[]){
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.print("Second Largest Number Of The Given Array is : ");
        return nums[1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Size Of Array: ");
        int n = sc.nextInt();

        Integer nums[] = new Integer [n];
        System.out.print("Enter array data: ");

        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(find2ndLargest(nums));
    }
}
