package ArrayList;
import java.util.*;

public class Main {
    public static void print(ArrayList <Integer> list){
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);

        list.add(100);
        // list.addLast(99);
        int k = list.get(0);
        System.out.println(list);
        System.out.println(k);
    }

    // Reverse
    public static void reverse (ArrayList <Integer> list){
        for (int i=list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }
    }

    // Maximum in arrayList
    public static void maxInList (ArrayList <Integer> list){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<list.size(); i++){
            max = Math.max(max, list.get(i));
        }
        System.out.println(max);
    }

    // Swap 2 Number
    public static void swap (ArrayList <Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    // Sorting an ArrayList
    public static void sorting (ArrayList <Integer> list){
        Collections.sort(list);
        System.out.println(list);
    }
    
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        print(list);
    }
}
