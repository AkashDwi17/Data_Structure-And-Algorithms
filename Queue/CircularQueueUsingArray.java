package Queue;
import java.util.*;

public class CircularQueueUsingArray {
    public static class Queue {
        int arr[];
        int size;
        int front;
        int rear;

        public Queue (int n){
            this.arr = new int [n];
            this.size = n;
            this.front = -1;
            this.rear = -1;
        }

        // Is Empty
        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        // Is Full
        public boolean isFull (){
            return (rear+1) % size == front;
        }

        // Add In Queue
        public void add (int data){
            if (isFull()){
                System.out.println("Queue is Full");
                return;
            }
            if (front == -1){
                front = 0;
            }
            rear = rear+1 % size;
            arr[rear] = data;
        }

        // Remove In Queue
        public int remove (){
            if (isEmpty()){
                return -1;
            }
            int top = arr[front];
            if (front == rear){
                return front = rear = -1;
            }else{
                front = (front + 1) % size;
            }
            return top;
        }

        // Peek
        public int peek (){
            if (isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
