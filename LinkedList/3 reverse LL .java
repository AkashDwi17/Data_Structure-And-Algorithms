// Reverse LinkedList


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

    public static void main (String args[]){
        addFirst(3);
        addFirst(2);
        addFirst(1);

        addLast(4);
        addLast(5);
        addLast(6);
        
        reverse ();
        print();
        
    }
}