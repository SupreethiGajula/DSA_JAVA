//confusing approach
class Solution {

    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode root) {
        if (root == null) return 0;

        int lh = checkHeight(root.left);
        if (lh == -1) return -1;

        int rh = checkHeight(root.right);
        if (rh == -1) return -1;

        if (Math.abs(lh - rh) > 1)
            return -1;

        return 1 + Math.max(lh, rh);
    }
}
//brute force approach
class Solution {

    // Function to calculate height
    public int height(TreeNode root) {
        if (root == null) return 0;

        return 1 + Math.max(height(root.left),
                            height(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int lh = height(root.left);
        int rh = height(root.right);

        // Check current node
        if (Math.abs(lh - rh) > 1)
            return false;

        // Check subtrees
        return isBalanced(root.left) &&
               isBalanced(root.right);
    }
}
