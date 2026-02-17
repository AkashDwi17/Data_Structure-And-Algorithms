package LeetCode75;

// Example 1:

// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true
// Example 2:

// Input: flowerbed = [1,0,0,0,1], n = 2
// Output: false


public class _4CanPlaceFlowers {
    public static boolean canPlaceFlowers(int arr[], int k) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                int prev = (i == 0) ? 0 : arr[i - 1];
                int next = (i == arr.length - 1) ? 0 : arr[i + 1];

                if (prev == 0 && next == 0) {
                    arr[i] = 1;
                    k--;

                    if (k == 0) {
                        return true;
                    }
                }
            }
        }

        return k <= 0;
    }

    public static void main(String[] args) {
        int arr[] = {1,0,0,0,1};
        int k = 2;
        System.out.println(canPlaceFlowers(arr, k));
    }
}




// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.