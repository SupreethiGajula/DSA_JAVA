package Stacks;

public class basic_array_impl {
    // Stack variables
    int top = -1;
    int[] stack = new int[10]; // Hardcoded size
    int capacity = 10;

    // Push operation
    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow");
            throw new RuntimeException("Stack Overflow");
        }
        stack[++top] = data;
    }

    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            throw new RuntimeException("Stack Underflow");
        }
        return stack[top--];
    }

    // Peek operation
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            throw new RuntimeException("Stack Underflow");
        }
        return stack[top];
    }

    // Display stack elements
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // Main method to test stack
    public static void main(String[] args) {
        basic_array_impl s = new basic_array_impl();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display(); // Output: 30 20 10

        System.out.println("Top element: " + s.peek()); // Output: 30

        System.out.println("Popped: " + s.pop()); // Output: 30
        s.display(); // Output: 20 10

        s.push(40);
        s.push(50);
        s.push(60);
        s.display(); // Output: 60 50 40 20 10
    }
}
