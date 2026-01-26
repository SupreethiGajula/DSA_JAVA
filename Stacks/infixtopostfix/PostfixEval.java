package Stacks.infixtopostfix;

import java.util.Stack;

public class PostfixEval {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // Skip spaces
            if (ch == ' ') continue;

            // If digit, parse and push it
            if (Character.isDigit(ch)) {
                int num = 0;

                // To handle multi-digit numbers
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--; // go back one position because the outer for loop will also increment i
                stack.push(num);
            }
            // If operator, pop 2 and apply operation
            else {
                int val2 = stack.pop();
                int val1 = stack.pop();

                switch (ch) {
                    case '+': stack.push(val1 + val2); break;
                    case '-': stack.push(val1 - val2); break;
                    case '*': stack.push(val1 * val2); break;
                    case '/': stack.push(val1 / val2); break;
                }
            }
        }

        return stack.pop(); // Final result
    }

    public static void main(String[] args) {
        String postfix1 = "2 3 1 * + 9 -"; // ((2 + (3 * 1)) - 9)
        String postfix2 = "5 6 2 + *";     // 5 * (6 + 2)
        System.out.println("Result 1: " + evaluatePostfix(postfix1)); // -4
        System.out.println("Result 2: " + evaluatePostfix(postfix2)); // 40
    }

}
