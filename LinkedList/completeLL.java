package LinkedList;

public class completeLL {
    public static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    static int count = 0;
    public static Node head;
    public static Node tail;

    // Add First
    public static void addFirst (int data){
        Node newNode = new Node (data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        count++;
    }

    // Add Last
    public static void addLast (int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        count ++;
    }

    // Print
    public static void print (){
        if (head == null){
            System.out.print("Null ");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Remove First
    public static int removeFirst (){
        if (head == null || head.next == null){
            head = null;
            return head.data;
        }
        int top = head.data;
        head = head.next;
        count --;
        return top;       
    }

    // Remove Last
    public static int removeLast() {
    if (count == 0) {
        System.out.println("List is empty!");
        return -1;
    }
    if (count == 1) {
        int val = head.data;
        head = tail = null;
        count = 0;
        return val;
    }

    Node temp = head;
    while (temp.next != tail) { // stop at second last node
        temp = temp.next;
    }
    int lastData = tail.data;
    temp.next = null;
    tail = temp;
    count--;
    return lastData;
}


    // Add Middle
    public static void addMiddle(int data, int idx){
        if (idx == 0) {
            addFirst(data);
            return;
        }
        
        int i = 0;
        Node temp = head;
        Node newNode = new Node(data);
        while (i < idx-1){
            i++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Reverse LinkedList
    public static void reverse (){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Find Mid Node
    public static void findMid (){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Mid Node Is: " + slow.data);
    }

    // Delete Nth From End
    public static void deleteNthFromEnd (int n){
        int sz = 0;
        Node temp = head;
        while (temp != null){
            sz ++;
            temp = temp.next;
        }
        int i = 1;
        int idxToFind = sz-n;
        Node prev = head;
        while (i < idxToFind){
            i++;
            prev = prev.next;
        }
        prev.next = prev.next.next;
    }

    // 
    public static void main (String args[]){
        // LinkedList ll = new LinkedList();

        // addFirst(1);
        // addFirst(2);
        // addFirst(3);
        // addFirst(4);

        // removeFirst()

        // addMiddle(100,3);

        // reverse

        // findMid

        // deleteNthFromEnd

        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        print();
        removeLast();
        print();
    }
}
