package Trees;

import java.util.Stack;

public class PreOrderIterative {

    public void preorderIterative(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            System.out.print(curr.data+" ");

            // Push right first
            if (curr.right != null) {
                stack.push(curr.right);
            }

            // Then push left
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
    }
}
