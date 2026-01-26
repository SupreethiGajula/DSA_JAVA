package LinkedList.unrolled;

public class Node {
    int elements[];
    int numElements;
    Node next;

    static final int NODE_CAPACITY = 4;//block size

    public Node(){
        elements = new int[NODE_CAPACITY];
        numElements = 0;
        next = null;
    }
}
