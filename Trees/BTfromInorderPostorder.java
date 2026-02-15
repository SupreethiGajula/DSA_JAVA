package Trees;

import java.util.HashMap;
import java.util.Map;

public class BTfromInorderPostorder {

    int postIndex;
    Map<Integer, Integer> inorderMap =
        new HashMap<>();

    public TreeNode buildTree(int[] inorder,
                              int[] postorder) {

        postIndex = postorder.length - 1;

        // Store inorder indices
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return construct(postorder,
                         0,
                         inorder.length - 1);
    }

    private TreeNode construct(int[] postorder,
                               int inStart,
                               int inEnd) {

        if (inStart > inEnd) {
            return null;
        }

        // Root from postorder
        int rootVal =
            postorder[postIndex--];

        TreeNode root =
            new TreeNode(rootVal);

        int inIndex =
            inorderMap.get(rootVal);

        // ⚠️ Build RIGHT first
        root.right =
            construct(postorder,
                      inIndex + 1,
                      inEnd);

        // Then LEFT
        root.left =
            construct(postorder,
                      inStart,
                      inIndex - 1);

        return root;
    }
}

    

