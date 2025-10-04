package LinkedList;
// Add Middle
    public static void addMiddle(int data, int idx){
        if (idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main (String args[]){
        addFirst(3);
        addFirst(2);
        addFirst(1);

        addLast(4);
        addLast(5);
        addLast(6);
        
        addMiddle(500, 3);
        print();
        
    }
}