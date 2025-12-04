import java.util.*;
public class Main {
    public static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
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
    }


    // Add Last 
    public static void addLast (int data){
        Node newNode = new Node (data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print
    public static void print (){
        if (head == null){
            System.out.print("null ");
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null ");
    }

    
    public static void main (String args[]){
        // LinkedList ll = new LinkedList ();
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        print();
    }
}