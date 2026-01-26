package LinkedList.basicOp;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insertAtStart(0);
        list.insertAtIndex(2, 10);
        list.insertAtEnd(20);
        list.deleteFirst();
        list.deleteLast();
        list.deleteAtIndex(1);
        list.show();
    }
}
