package LeetCode75;
import java.util.*;

public class _2KidsWithTheGreatestNumberOfCandies {

    public static ArrayList<Boolean> kidsWithTheGreatestNumberOfCandies(int arr[], int k) {

        int largest = Integer.MIN_VALUE;

        // First loop → find global maximum
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        ArrayList<Boolean> list = new ArrayList<>();

        // Second loop → compare with global maximum
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] + k >= largest) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        return list;
    }

    public static void main(String args[]) {
        int arr[] = {12, 1, 12};
        int k = 10;
        System.out.println(kidsWithTheGreatestNumberOfCandies(arr, k));
    }
}




// Example 1:

// Input: candies = [2,3,5,1,3], extraCandies = 3
// Output: [true,true,true,false,true] 
// Explanation: If you give all extraCandies to:
// - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
// - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
// - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
// - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
// - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
// Example 2:

// Input: candies = [4,2,1,1,2], extraCandies = 1
// Output: [true,false,false,false,false] 
// Explanation: There is only 1 extra candy.
// Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
// Example 3:

// Input: candies = [12,1,12], extraCandies = 10
// Output: [true,false,true]
