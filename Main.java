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
        System.out.println();
    }

    // Add Middle In LL

    public static void addMiddle (int data, int idx){

        Node newNode = new Node (data);
        if (head == null){
            return;
        }
        int i = 0;
        Node temp = head;
        while (i<idx-1){
            i++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Reverse LL
    public static void reverse (){
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Delete nth Node from end

    public static void deleteNthNode (int n){
         
        int sz = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            sz++;
        }

        if (n == sz){
            head = head.next;
            return;
        }
        int i = 1;
        int idxToFind = sz-n;
        Node prev = head;

        while (i < idxToFind){
            i++;
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return;
    }

    // check is palindrome

    public static Node findMid (Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static boolean isPalindrome (){
        if (head == null || head.next == null){
            return true;
        }
        Node midNode = findMid(head);

        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;

        while (right != null){
            if (left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main (String args[]){
        // LinkedList ll = new LinkedList ();
        addLast(1);
        addLast(2);
        addLast(1);
        addLast(2);
        addLast(1);
        print();
        System.out.println(isPalindrome());
    }
}