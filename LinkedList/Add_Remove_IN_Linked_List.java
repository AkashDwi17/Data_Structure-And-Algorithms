import java.util.*;

public class Add_Remove_IN_Linked_List {
    public static class Node {
        int data;
        Node next;
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head = null;
    public static Node tail = null;


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
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Remove First
    public static int removeFirst (){
        if (head == null || head.next == null){
            return head.data;
        }
        int top = head.data;
        head = head.next;
        return top;
    }

    // PrintLinkedList

    public static void print (){
        if (head == null){
            System.out.println("null");
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main (String args[]){
        addFirst(3);
        addFirst(2);
        addFirst(1);
        System.out.println("------------0-----------");
        print();
        System.out.println("------------1-----------");
        addLast(4);
        addLast(5);
        addLast(6);
        System.out.println("-------------2----------");
        print();
        System.out.println();
        removeFirst();
        print();
        
    }
}