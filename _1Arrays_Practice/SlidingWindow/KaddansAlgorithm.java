package SlidingWindow;

public class KaddansAlgorithm {
    public static int kaddans (int arr[]){
        int currSum = arr[0];
        int maxSum = arr[0];
        
        for (int i=1; i<arr.length; i++){
            currSum = Math.max(arr[i], currSum+arr[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, -5, 1, 3, 2};
        System.out.println(kaddans(arr));
    }
}
