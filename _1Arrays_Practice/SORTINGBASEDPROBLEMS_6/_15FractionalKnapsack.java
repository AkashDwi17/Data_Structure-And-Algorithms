package SORTINGBASEDPROBLEMS_6;

/*

🔥 Concept:

You can take fractions of items.
Goal: maximize value under capacity.

✔ Approach

Sort items by value/weight (descending).

Input
weights = [10, 20, 30]
values  = [60,100,120]
capacity = 50

Output
Max Value = 240  
Explanation:
Take whole 20kg + 30kg fraction*/


import java.util.Arrays;

class Item {
    int value, weight;
    double ratio;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
        this.ratio = (double) value / weight;
    }
}

public class _15FractionalKnapsack {

    public static double fractionalKnapsack(int capacity, Item[] items) {
        // Step 1: Sort items by value/weight ratio descending
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double totalValue = 0;
        for (Item item : items) {
            if (capacity >= item.weight) {
                // Take whole item
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                // Take fraction
                totalValue += item.value * ((double) capacity / item.weight);
                break; // Knapsack full
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Item[] items = {
            new Item(60, 10),
            new Item(100, 20),
            new Item(120, 30)
        };
        int capacity = 50;

        double maxValue = fractionalKnapsack(capacity, items);
        System.out.println("Max Value = " + maxValue);
    }
}
