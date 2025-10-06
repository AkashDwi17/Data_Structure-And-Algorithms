package Recursion;

import java.util.*;

public class FibonachiUsingMemoization {
    public static int findFibonachi(int n, int[] dp) {
        // Base cases
        if (n == 0) {
            return 0;
        }   
        if (n == 1) {
            return 1;
        }   
        // If already calculated, return stored value
        if (dp[n] != -1) {
            return dp[n];
        }
        
        // Recursive calls + store in dp
        dp[n] = findFibonachi(n - 1, dp) + findFibonachi(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 6; // Example: Find Fibonacci(10)
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1); // initialize dp array with -1

        System.out.println(findFibonachi(n, dp));
    }
}
