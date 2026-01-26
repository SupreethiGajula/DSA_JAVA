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
        treeobj.inorder();
        System.out.println("----------------------------");
        treeobj.preorder();
        System.out.println("----------------------------");
        treeobj.postorder();

    }
}
