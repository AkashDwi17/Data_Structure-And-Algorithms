package GreedyAlgorithm;
import java.util.*;

public class IndianCoin {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        int amount = 590;

        ArrayList<Integer> list = new ArrayList<>();
        int totalCoin = 0;

        Arrays.sort (coins, Collections.reverseOrder());

        for (int i=0; i<coins.length; i++){
            if (coins[i] <= amount){
                while (amount >= coins[i]){
                totalCoin ++;
                list.add (coins[i]);
                amount -= coins[i];
                }
            } 
        }
        System.out.println ("Total Coins " + totalCoin);
        System.out.print (list);
    }
}
