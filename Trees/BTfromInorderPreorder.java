package Trees;

import java.util.HashMap;
import java.util.Map;

public class BTfromInorderPreorder {
    int preIndex = 0;
    Map<Integer, Integer> inorderMap = new HashMap<>();

    public TreeNode BuildBT(int []preorder,int []inorder){
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return construct(preorder, 0,
                         inorder.length - 1);
    }

    private TreeNode construct(int[] preorder,int inStart,int inEnd) {
        if(inStart>inEnd){
            return null;
        }
            int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        int inIndex = inorderMap.get(rootVal);

        // Build left subtree
        root.left =
            construct(preorder,
                      inStart,
                      inIndex - 1);

        // Build right subtree
        root.right =
            construct(preorder,
                      inIndex + 1,
                      inEnd);

        return root;
    }

}


    

