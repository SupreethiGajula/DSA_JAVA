package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaxElementInBinarytree {

    public int findMaxBT(TreeNode root) {

        // Edge case
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int max = root.data;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr.data > max) {
                max = curr.data;
            }

            if (curr.left != null) {
                q.add(curr.left);
            }

            if (curr.right != null) {
                q.add(curr.right);
            }
        }

        System.out.println(max);
        return max;
    }
}

