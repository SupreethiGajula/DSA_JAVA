package Trees;

public class Main {
    public static void main(String []args){
        BinarySearchTreeOp treeobj = new BinarySearchTreeOp();
        treeobj.insert(50);
        treeobj.insert(30);
        treeobj.insert(20);
        treeobj.insert(75);
        treeobj.insert(80);
        treeobj.insert(10);
        System.out.println("Inorder:");
        treeobj.inorder();
        System.out.println("----------------------------");
        System.out.println("Preorder:");
        treeobj.preorder();
        System.out.println("----------------------------");
        System.out.println("PostOrder:");
        treeobj.postorder();
        System.out.println("------------------------------\n");
        PreOrderIterative preorder = new PreOrderIterative();
        preorder.preorderIterative(treeobj.root);
        System.out.println("------------------------------\n");
        PostOrderIterative postorder = new PostOrderIterative();
        postorder.postOrderIterative(treeobj.root);
        System.out.println("------------------------------\n");
        InOrderIterative inorder = new InOrderIterative();
        inorder.inorderIterative(treeobj.root);



    }
}
