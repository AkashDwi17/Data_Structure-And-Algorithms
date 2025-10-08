package Queue;

public class QueueUsingLinkedList {
    public static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue{
        public static Node head = null;
        public static Node tail = null;

        // Is Empty
        public static boolean isEmpty(){
            return head == null;
        }

        // Add Data
        public static void add (int data){
            Node newNode = new Node (data);
            
            if (head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        
        // Remove data
        public static int remove (){
            if (isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek Data
        public static int peek (){
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
