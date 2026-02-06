package Trees;

public class StructuralSimilarity {
    public boolean structuralSimilarity(TreeNode root1,TreeNode root2){
        if(root1 == null && root2==null){
            return true;
        }
        if(root1==null|| root2==null){
            return false;
        }
        return(structuralSimilarity(root1.left, root2.left)&&structuralSimilarity(root1.right, root2.right));
//mirror tree similarity
//return (structuralSimilarity(root1.left, root2.right) && structuralSimilarity(root1.right, root2.left));

    }
    
}
