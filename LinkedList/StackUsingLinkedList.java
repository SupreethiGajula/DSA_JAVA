package LinkedList;

class Node {
    int data;
    Node next;
}

public class StackUsingLinkedList {
    private Node top;

    private void push(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = top;
        top = newNode;
    }

    private int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    private int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    private void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        // Since we're inside the same class, we can call private methods
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Current stack:");
        stack.printStack();
        System.out.println("Popped: " + stack.pop());
        System.out.println("Current stack after pop:");
        stack.printStack();
        System.out.println("Peek: " + stack.peek());
    }
}
