import java.util.*;
public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public  Node head;
    public  Node tail;

    // Add First
    public  void addFirst (int data){
        Node newNode = new Node (data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    // Add Last 
    public void addLast (int data){
        Node newNode = new Node (data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print
    public void print (){
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
        LinkedList ll = new LinkedList ();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
    }
}