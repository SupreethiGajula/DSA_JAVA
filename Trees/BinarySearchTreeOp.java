package Trees;

public class BinarySearchTreeOp {
    TreeNode root;
    public void insert(int key) {
        root = insertRec(root, key);
    
    }
    public void inorder(){
        inorderRec(root);
    }
    public void preorder(){
        preorderRec(root);
    }
    public void postorder() {
    postorderRec(root);
    }   
    public void delete(){
        root = deleteRec(root,key);
    }
    public boolean search(int key) {
    return searchRec(root, key);
    }

    public TreeNode insertRec(TreeNode root,int key){
        if(root == null){
            root = new TreeNode(key);
            return root;
            
        }else if(root.data<key){
            root.right = insertRec(root.right,key);
        }else if(root.data>key){
            root.left = insertRec(root.left,key);
        }
        return root;
    } 
    private void inorderRec(TreeNode root){
        if(root == null){
            return;
        }
        inorderRec(root.left);
        System.out.println(root.data);
        inorderRec(root.right);

    }
    private void preorderRec(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preorderRec(root.left);
        preorderRec(root.right);
    }
    private void postorderRec(TreeNode root) {
    if (root == null) {
        return;
    }

    postorderRec(root.left);
    postorderRec(root.right);
    System.out.print(root.data + " ");
}
    private void deleteRec(TreeNode root,int key){
        if(root == null){
            return root;
        }
        f (key < root.data) {
        root.left = deleteRec(root.left, key);
    } else if (key > root.data) {
        root.right = deleteRec(root.right, key);
    } else {
        //we found our node to delete
        //case 1 no child nodes
        if(root.left == null && root.right == null){
            return null;
        }
        //case 2 1 child node
        if(root.left == null){
            return root.right;
        }
        else if(root.right == null){
            return root.left;
        }
        //case 3 has both children
        root.data = minValue(root.right);
        root.right = deleteRec(root.right, root.data);
    }
    return root;
}
private boolean searchRec(TreeNode root, int key) {
    // Base case: not found
    if (root == null) {
        return false;
    }
    // Key found
    if (root.data == key) {
        return true;
    }
    // Search left subtree
    if (key < root.data) {
        return searchRec(root.left, key);
    }
    // Search right subtree
    else {
        return searchRec(root.right, key);
    }
}

private int minValue(TreeNode root) {
    int min = root.data;
    while (root.left != null) {
        min = root.left.data;
        root = root.left;
    }
    return min;
}
}