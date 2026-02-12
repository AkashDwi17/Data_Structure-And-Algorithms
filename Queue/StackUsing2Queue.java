package Queue;

import java.util.*;
public class StackUsing2Queue{
    public static class Stack {
        Queue <Integer> q1 = new LinkedList<>();
        Queue <Integer> q2 = new LinkedList<>();

        public boolean isEmpty(){
            return q1.isEmpty();
        }

        // push 
        public void push (int data) {
            while (!q1.isEmpty()){
                q2.add(q1.remove());
            }
            q1.add (data);

            while (!q2.isEmpty()){
                q1.add(q2.remove());
            }
        }
        // pop
        public int pop(){
            if (isEmpty()){
                return -1;
            }
            return q1.remove();
        }

        // peek
        public  int peek(){
            if (isEmpty()){
                return -1;
            }
            return q1.peek();
        }
    }
    public static void main (String args[]){
        Stack s = new Stack();
        s.push (1);
        s.push (2);
        s.push (3);
        s.push (4);
        s.push (5);

        while (!s.isEmpty()){
            System.out.print (s.peek());
            s.pop();
        }
    }
}