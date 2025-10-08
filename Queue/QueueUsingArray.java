package Queue;

public class QueueUsingArray {
    public static class Queue {
        int arr[];
        int size;
        int rear;

        public Queue (int n){
            this.arr = new int[n];
            this.size = n;
            this.rear = -1;
        }

        // Is Empty
        public boolean isEmpty(){
            return rear == -1;
        }

        // Add in Queue
        public void add (int data){
            if (rear == size-1){
                System.out.println("Queue Is Full");
                return;
            }
            rear = rear+1;
            arr[rear] = data;            
        }

        // Remove in Queue
        public int remove(){
            if (isEmpty()){
                return -1;
            }
            int top = arr[0];
            for (int i=0; i<=rear; i++){
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return top;
        }

        // Peek in Queue
        public int peek(){
            if (isEmpty()){
                return -1;
            }
            return arr[0];
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
