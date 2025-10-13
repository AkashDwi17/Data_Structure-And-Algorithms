package PrefixSumSuffixSum;

// Problem 2: Range Sum Query

// Company: TCS, Accenture
// Statement: Given an array and queries (L, R), find sum of elements from L to R using prefix sum.
// Input: arr = [1, 2, 3, 4, 5], query = (2, 4)
// Output: 9 (2 + 3 + 4 = 9)

public class RangeSumQuery {
    public static int rangeSumQuery (int arr[], int left, int right){
        int sum = 0;
        for (int i=left-1; i<right; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(rangeSumQuery(arr, 2, 4));
    }
}
