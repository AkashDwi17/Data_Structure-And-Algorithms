package LinkedList;


// remove cycle from LinkedList

 public static void removeCycle (){
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        
        while (fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                isCycle = true;
                break;
            }
        }
        if (isCycle == false){
            System.out.println("Cycle Doesen't Exists!");
            return;
        }

        Node prev = null;
        slow = head;


//         🔁 Example 1: Cycle starts at head
// 1 → 2 → 3
// ↑       ↓
// ← ← ← ← ←

        // Case 1
        if (slow == fast){
            while (fast.next != slow){
                fast = fast.next;
            }
            fast.next = null;
            return;
        }



        while (slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
    
    public static void main (String args[]){
        // addLast(1);
        // addLast(2);
        // addLast(2);
        // addLast(2);
        // print();
        // System.out.print (isPalindrome());
        

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(isCycle());
        System.out.println();
        removeCycle();
        System.out.println(isCycle());

    }
}