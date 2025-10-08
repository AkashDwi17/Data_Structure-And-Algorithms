package Deque;
import java.util.*;

public class ImplementStackUsingDeque {
    public static class Stack{
        Deque <Integer> dq = new LinkedList<>();

        // Add
        public void push (int data){
            dq.addLast(data);
        }

        // Remove
        public int pop (){
            return dq.removeLast();
        }

        // Peek 
        public int peek (){
            return dq.getLast();
        }
        
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("peek = " + s.peek());

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
