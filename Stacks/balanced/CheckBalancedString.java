package Stacks.balanced;

import java.util.Stack;

public class CheckBalancedString {

    public static boolean isBalanced(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If opening bracket, push it
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            }
            // If closing bracket, check if top matches
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stk.isEmpty()) {
                    return false;  // closing bracket without opening
                }
                char top = stk.peek();
                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {
                    stk.pop();
                } else {
                    return false;  // mismatched pair
                }
            }
            // If you want to ignore other characters, do nothing here.
            // Or if you want strict checking, return false.
        }

        // If stack empty, all opening brackets matched
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("(){}[]"));     // true
        System.out.println(isBalanced("({[]})"));     // true
        System.out.println(isBalanced("({[)]}"));     // false
        System.out.println(isBalanced("((())"));      // false
        System.out.println(isBalanced("abc"));        // true (no brackets)
        System.out.println(isBalanced("a(b)c[d]{e}"));// true
    }
}
