import java.util.*;
public class Main{
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

public static void print (){
    Node temp = head;
    if (head == null){
        System.out.print("emptyLL");
    }
    while (temp != null){
        System.out.print(temp.data+" -> ");
        temp = temp.next;
    }
    System.out.println();
}

public static int removeFirst (){
    if (head == null){
        return -1;
    }
    int top = head.data;
    head = head.next;
    return top;
}

public static void addMiddle (int data, int idx){
    Node newNode = new Node (data);
    if (idx == 0){
        addFirst(data);;
    }
    Node temp = head;
    int i = 0;
    while (i < idx-1){
        temp = temp.next;
        i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
}

public static void reverseLL (){
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

public static void deleteNthFromEnd (int n){
    int sz = 0;
    Node temp = head;
    while (temp!= null){
        sz ++;
        temp = temp.next;
    }
    int i = 1;
    int idxTOFind = sz-n;
    Node prev = head;
    while (i < idxTOFind-1){
        prev = prev.next;
        i ++;
    }
    prev.next = prev.next.next;
}

// Find Mid Node
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
    if (head == null ||head.next == null){
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
        addLast(1);
        addLast(2);
         addLast(1);
        addLast(2);
        addLast(3);
        print();
        
        System.out.println(isPalindrome());

    }
}
