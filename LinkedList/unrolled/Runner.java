package LinkedList.unrolled;

public class Runner {
    public static void main(String[] args) {
        ULL ull = new ULL();
        ull.insertAtEnd(0);
        ull.insertAtEnd(1);
        ull.insertAtEnd(2);
        ull.insertAtEnd(3);
        ull.insertAtEnd(4);
        ull.insertAtEnd(5);
        ull.insertAtEnd(6);
        ull.insertAtIndex(99, 5);//inserting 99
        ull.deleteAtIndex(5);//deleting 99
        ull.printList();
    }

}
