package Trees;

public class DepthOfBinaryTreeRecursive {
    public int depthOfBinaryTree(TreeNode root){
        if(root == null){
            return 0;
        }
        else{
            int leftMaxDepth = depthOfBinaryTree(root.left);
            int rightMaxDepth = depthOfBinaryTree(root.right);
            return (leftMaxDepth>rightMaxDepth)?leftMaxDepth+1:rightMaxDepth+1;
        }
    }
}
