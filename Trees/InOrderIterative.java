package Trees;

import java.util.Stack;

public class InOrderIterative {

    public void inorderIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {

            // Step 1: go to leftmost node
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // Step 2: process node
            curr = stack.pop();
            System.out.print(curr.data + " ");

            // Step 3: go to right subtree
            curr = curr.right;
        }
    }
}
