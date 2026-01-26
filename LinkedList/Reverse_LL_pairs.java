package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Reverse_LL_pairs {
    public Node reverse_Pairs(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node dummy = new Node(0); 
        dummy.next = head;
        Node prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = first.next;

            // Swap the pair
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move prev two nodes ahead
            prev = first;
        }

        return dummy.next;
    }

    // Helper method to print the list
    public void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        Reverse_LL_pairs list = new Reverse_LL_pairs();

        // Create: 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original list:");
        list.printList(head);

        head = list.reverse_Pairs(head);

        System.out.println("List after pairwise reversal:");
        list.printList(head);
    }
}
//-------------------------------recursive approachh----------------------------------------------
// public Node reverse_pairs(Node head){
//     if(head==null || head.next==null){
//         return head;
//         }
//         Node head;
//         Node temp = new Node();
//         temp=head.next;
//         head.next=temp.next;
//         temp.next=head;
//         head=temp;
//         head.next.next=reverse_pairs(head.next.next);
// return head;
// }