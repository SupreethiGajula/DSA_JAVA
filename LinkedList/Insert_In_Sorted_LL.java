package LinkedList;

class Node {
    int val;
    Node next;
}

public class Insert_In_Sorted_LL {
    public static void main(String[] args) {
        Insert_In_Sorted_LL list = new Insert_In_Sorted_LL();
        list.insert_Sorted(10);
        list.insert_Sorted(5);
        list.insert_Sorted(15);
        list.insert_Sorted(12);
        list.printList(); // Output: 5 10 12 15
    }
    Node head;

    public void insert_Sorted(int data) {
        Node newNode = new Node();
        newNode.val = data;

        // Case 1: Insert at beginning or into an empty list
        if (head == null || head.val >= data) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Case 2: Insert in middle or end
        Node temp = head;
        while (temp.next != null && temp.next.val < data) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
    

