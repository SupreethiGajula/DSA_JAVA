package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestNodeinTree {

    public TreeNode deepestNodeinTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        TreeNode curr = null;   

        while (!q.isEmpty()) {

            curr = q.poll();   // last polled = deepest

            if (curr.left != null) {
                q.offer(curr.left);
            }

            if (curr.right != null) {
                q.offer(curr.right);
            }
        }

        return curr;
    }
}
