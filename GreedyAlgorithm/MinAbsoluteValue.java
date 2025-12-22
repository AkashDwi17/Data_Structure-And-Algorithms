package GreedyAlgorithm;
import java.util.*;

public class MinAbsoluteValue { // Ans = 1
    public static void main(String[] args) {
        int A[] = {1,2,3};
        int B[] = {2,1,4};

        Arrays.sort (A);
        Arrays.sort (B);

        int minDif = 0;

        for (int i=0; i<A.length; i++){
            minDif += Math.abs(A[i]-B[i]);
        }
        System.out.println("Min Diff Of Pair: " + minDif);
    }
}
