package LinkedList.basicOp;

public class DoublyLinkedRunner {
    public static void main(String[] args) {
        DoublyLinked doublyLinkedList = new DoublyLinked();
        doublyLinkedList.insertAtStart(10);
        doublyLinkedList.insertAtStart(20);
        doublyLinkedList.insertAtEnd(40);
        doublyLinkedList.insertAtIndex(30,2);
        doublyLinkedList.deleteAtStart();
        doublyLinkedList.deleteAtEnd();
        doublyLinkedList.deleteAtIndex(1);
        doublyLinkedList.display();
    }
}
