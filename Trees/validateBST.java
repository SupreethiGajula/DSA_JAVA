/*
 * Validates whether a binary tree is a Binary Search Tree (BST).
 *
 * A tree is a valid BST if:
 *  - All nodes in the left subtree are strictly less than the root.
 *  - All nodes in the right subtree are strictly greater than the root.
 *  - Both subtrees must also be valid BSTs.
 *
 * Approach:
 *  Uses range (min, max) constraints while traversing the tree.
 *  Each node must lie within its allowed value range derived
 *  from its ancestors.
 *
 * Time Complexity: O(n)
 *  - Every node is visited exactly once.
 *
 * Space Complexity: O(h)
 *  - Due to recursion stack, where h = height of the tree.
 *  - Worst case (skewed tree): O(n)
 *  - Best case (balanced tree): O(log n)
 */

class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean validate(TreeNode node, long min, long max) {
        if (node == null) return true;

        if (node.val <= min || node.val >= max) {
            return false;
        }
        return validate(node.left, min, node.val) &&
               validate(node.right, node.val, max);
    }
}

        
