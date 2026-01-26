package LinkedList.circular;

public class Runner {
    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
        cl.insertAtStart(10);
        cl.insertAtStart(7);
        cl.insertAtEnd(12);
        cl.insertAtEnd(15);
        cl.insertAtIndex(3,0);
        cl.insertAtIndex(19, 5);//inserts at the end
        cl.insertAtIndex(23,7);//prints index out of bounds and does nothing
        cl.insertAtIndex(40,18);//index out of bounds
        cl.deleteAtStart();
        cl.deleteAtStart();
        cl.deleteAtEnd();
        cl.deleteAtIndex(1);
        cl.printList();
    }

}
