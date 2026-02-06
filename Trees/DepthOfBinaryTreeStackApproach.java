package Trees;

import java.util.Stack;

public class DepthOfBinaryTreeStackApproach {

    public class Pair {
        TreeNode root;
        int depth;

        public Pair(TreeNode root, int d) {
            this.root = root;   
            this.depth = d;
        }
    }

    public int depthOfBinaryTree(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Stack<Pair> s = new Stack<>();
        s.push(new Pair(root, 1));

        int maxDepth = 0;   

        while (!s.isEmpty()) {

            Pair p = s.pop();

            TreeNode node = p.root;   
            int depth = p.depth;

            maxDepth = Math.max(maxDepth, depth);

            if (node.left != null)
                s.push(new Pair(node.left, depth + 1));

            if (node.right != null)
                s.push(new Pair(node.right, depth + 1));
        }

        return maxDepth;
    }
}
