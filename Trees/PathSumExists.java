package Trees;

public class PathSumExists {
    public boolean hasPathSum(TreeNode root, int sum) {

    if (root == null) {
        return false;
    }

    // Check current node
    if (root.data == sum) {
        return true;
    }

    int remainingSum = sum - root.data;

    return hasPathSum(root.left, remainingSum) ||
           hasPathSum(root.right, remainingSum);
}
    public boolean hasPathSumToLeaf(TreeNode root, int targetSum) {
    
    // Base case: if tree is empty
    if (root == null) {
        return false;
    }

    // If current node is a leaf
    if (root.left == null && root.right == null) {
        return targetSum == root.data;
    }

    // Subtract current node value
    int remainingSum = targetSum - root.data;

    // Recur for left OR right subtree
    return hasPathSumToLeaf(root.left, remainingSum) ||
           hasPathSumToLeaf(root.right, remainingSum);
}

    
}
