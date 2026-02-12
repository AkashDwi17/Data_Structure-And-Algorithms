package Queue;

public class QueueUsingArray {

    static class Queue {
        int arr[];
        int size;
        int front;
        int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        boolean isEmpty() {
            return front == -1 || front > rear;
        }

        void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = data;
        }

        int remove() {
            if (isEmpty()) {
                return -1;
            }
            int result = arr[front];
            front++;
            return result;
        }

        int peek() {
            if (isEmpty()) {
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
