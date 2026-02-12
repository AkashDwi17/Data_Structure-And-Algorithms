package Queue;
import java.util.*;

public class CircularQueueUsingArray {

    static class CircularQueue {
        int arr[];
        int size;
        int front;
        int rear;

        CircularQueue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        // check empty
        boolean isEmpty() {
            return front == -1;
        }

        // check full
        boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add
        void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            // first element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove
        int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = arr[front];

            // single element case
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // peek
        int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String args[]) {
        CircularQueue q = new CircularQueue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q.remove()); // 10
        q.add(60); // Works because circular

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
