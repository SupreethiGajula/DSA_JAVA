package Stacks.infixtopostfix;
import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfixConversion {
    public static int precedence(char ch){
        if(ch == '+' || ch == '-')
        return 1;
        else if(ch == '*' || ch == '/')
        return 2;
        else if(ch == '^')
        return 3;
        else
        return -1;
    }
    public static String infixToPostfix(String exp){
        StringBuilder result = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        for(int i =0;i<exp.length();i++){
            char ch = exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result.append(ch);
            }
            else if(ch == '('){
                stk.push(ch);
            }
            else if(ch == ')'){
                while(!stk.isEmpty() && stk.peek() != '('){
                    result.append(stk.pop());
                }
                stk.pop();
            }
            else{
                while(!stk.isEmpty() && precedence(ch) <= precedence(stk.peek())){
                    result.append(stk.pop());
                }
                stk.push(ch);
            }
        }
        while(!stk.isEmpty()){
            result.append(stk.pop());
            }
            //string builder can't be converted into string if returned directly that
            //is why we are converting it into strings
        return result.toString();
    }
    public static void main(String[] args) {
        String infix1 = "a+b*c";
        String infix2 = "(a+b)*c";
        String infix3 = "a+b*(c^d-e)^(f+g*h)-i";

        System.out.println("Infix: " + infix1 + " → Postfix: " + infixToPostfix(infix1));
        System.out.println("Infix: " + infix2 + " → Postfix: " + infixToPostfix(infix2));
        System.out.println("Infix: " + infix3 + " → Postfix: " + infixToPostfix(infix3));
    } 

}
