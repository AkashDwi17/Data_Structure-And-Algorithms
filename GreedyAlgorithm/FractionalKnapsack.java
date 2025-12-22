package GreedyAlgorithm;
import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) { // Ans = 240
        int val[] = {60, 100, 120};
        int wt[] = {10,20,30};

        int W = 50;

        double ratio [][] = new double[val.length][2];
        int capacity = W;
        int finalValue = 0;
        for (int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)wt[i];
        }

        Arrays.sort (ratio, Comparator.comparingDouble(o->o[1]));
        for (int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];

            if (capacity >= wt [idx]){
                finalValue += val[idx];
                capacity -= wt[idx];
            }
            else{
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println(finalValue);
    }
}
