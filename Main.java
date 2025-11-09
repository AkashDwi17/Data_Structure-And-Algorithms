import java.util.*;
public class Main {
    public static void main (String arg[]){
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};
        Integer amount = 1133;
        Arrays.sort (coins, Comparator.reverseOrder());
        ArrayList <Integer> list = new ArrayList<>();

        for (int i=0; i<coins.length; i++){
            while (amount >= coins[i]){
                list.add(coins[i]);
                amount -= coins[i];
            }
        }
        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}