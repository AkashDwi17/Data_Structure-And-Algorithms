package DSA_LAB_TEST;
import java.util.*;

public class InsertNodeIntoSpecificPosition {
    public static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static void addLast(int data){
        Node newNode = new Node (data);
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void print (){
        if (head == null){
            System.out.print("null ");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
    }

    public static void addNthPosition (int data, int n){
        if (head == null){
            return;
        }
        Node newNode = new Node (data);
        Node temp = head;
        for (int i=0; i<n-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String[] args) {
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);

        print();

        System.out.println();
        addNthPosition(100, 2);
        print();


    }
}
