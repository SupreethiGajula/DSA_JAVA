package Trees;

public class DiameterofTree {
    int Diameter = 0;
    public int diameterofTree(TreeNode root){
        height(root);
        return Diameter;
    }
    public int height(TreeNode root){
        int lh=0;
        int rh=0;
        lh = height(root.left);
        rh = height(root.right);

        Diameter = Math.max(Diameter,lh+rh+1);

        return Math.max(lh, rh);
    }
    
}
