package LinkedList;
// Find And remove nth node from end (size - n - 1)

    public static void deleteNthFromEnd (int n){
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
            prev = prev.next;
            i ++;
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main (String args[]){
        addFirst(3);
        addFirst(2);
        addFirst(1);

        addLast(4);
        addLast(5);
        addLast(6);
        
       print();
       System.out.println("----------------");
       deleteNthFromEnd(3);
       print();
        
    }
}