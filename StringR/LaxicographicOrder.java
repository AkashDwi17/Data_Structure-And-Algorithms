package StringR;
import java.util.*;

public class LaxicographicOrder {
    public static void laxicographicOrder (String fruits[]){
        String largest = fruits[0];
        for (int i=1; i<fruits.length; i++){
            if (largest.compareToIgnoreCase(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String fruits[] = {"Mango", "Orange", "Grapes", "Papaya", "Banana"};
        laxicographicOrder(fruits);
    }
}
