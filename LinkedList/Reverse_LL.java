package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Reverse_LL{
    Node head;

    // Function to add a node at the end
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(data);
    }

    // Function to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;   // Store next node
            current.next = prev;   // Reverse current node's pointer
            prev = current;        // Move prev to current node
            current = next;        // Move to next node
        }

        head = prev; // Update head to the new first node
    }

    // Function to print the linked list
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Main method to test the reversal
    public static void main(String[] args) {
        Reverse_LL list = new Reverse_LL();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        System.out.println("Original List:");
        list.printList();

        list.reverse();

        System.out.println("Reversed List:");
        list.printList();
    }
}
