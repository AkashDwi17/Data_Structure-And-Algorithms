import java.util.*;

public class Main{
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

        public boolean isEmpty (){
            return front == -1 && rear == -1;
        }

        public boolean isFull (){
            return (rear+1)%size == front;
        }

        public void add (int data){
            if (isFull()){
                return;
            }
            if (front == -1){
                front = 0;
            }
            rear = rear+1%size;
            arr[rear] = data;
        }

        public int remove (){
            if (isEmpty()){
                return -1;
            }
            int top = arr[front];

            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return top;
        }
        
        public int peek(){
            if (isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }
    public static void main (String args[]){
        Queue q = new Queue (5);
        q.add (1);
        q.add (2);
        q.add (3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}