package Deque;
import java.util.*;

public class ImplementQueueUsingDeque {
    public static class Queue {
        Deque <Integer> dq = new LinkedList<>();
        // add
        public void add (int data){
            dq.addLast(data);
        }
        // remove
        public int remove (){
            return dq.removeFirst();
        }

        // peek
        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("peek: " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
