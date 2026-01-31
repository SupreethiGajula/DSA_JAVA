package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PostOrderIterative {

    public List<Integer> postOrderIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            result.add(curr.data);

            // Push left first
            if (curr.left != null) {
                stack.push(curr.left);
            }

            // Push right after
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }

        Collections.reverse(result);
        for(int i:result){
            System.out.print(i+" ");
        }
        return result;
        
    }
}
