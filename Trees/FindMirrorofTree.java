class FindMirrorofTree{
  public TreeNode findmirror(TreeNode root){
    if(root == null){
      return root;
    }
    findmirror(root.left);
    findmirror(root.right);
    TreeNode temp=root.left;
    root.left=root.right;
    root.right = temp
  return root
      }
}
