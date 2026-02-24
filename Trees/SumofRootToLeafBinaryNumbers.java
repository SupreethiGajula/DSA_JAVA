/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        List<String> res = new ArrayList<>();
        allPathMethod(root, res, "");
        int sum = 0;
        for(String path : res){
            int decimalNumber = Integer.parseInt(path, 2);
            sum += decimalNumber;
        }
        return sum;
    }
    private void allPathMethod(TreeNode root, List<String> res, String path){
        if(root == null) return;
        path += root.val;
        if(root.left == null && root.right == null){
            res.add(path);
        }
        allPathMethod(root.left, res, path);
        allPathMethod(root.right, res, path);
    }
}
