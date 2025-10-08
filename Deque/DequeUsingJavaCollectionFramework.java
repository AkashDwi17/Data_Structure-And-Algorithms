package Deque;
import java.util.*;

public class DequeUsingJavaCollectionFramework {
    public static void main(String[] args) {
        Deque <Integer> dq = new LinkedList<>();

        dq.addFirst(1);
        dq.addLast(2);

        dq.removeFirst();
        dq.removeLast();

        dq.add(7);

        dq.getFirst();
        dq.getLast();

        System.out.println(dq);
    }
}
