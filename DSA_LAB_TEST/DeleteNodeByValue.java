package DSA_LAB_TEST;
import java.util.*;

public class DeleteNodeByValue {
    public  static void deleteVal (LinkedList <Integer> ll, int n){
        // ll.removeFirstOccurrence(n);
        ll.removeLastOccurrence(n);
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(3);


        System.out.println(ll);
        deleteVal(ll, 3);
        System.out.println();
        System.out.println(ll);
    }
}
