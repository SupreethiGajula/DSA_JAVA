package Trees;

import java.util.Queue;
import java.util.LinkedList;


/**
 * Calculates the width of a binary tree.
 *
 * The width of a binary tree is defined as the maximum number
 * of nodes present at any level (depth) of the tree.
 *
 * This method uses Level Order Traversal (Breadth-First Search)
 * with a queue to traverse the tree level by level. At each level,
 * it counts the number of nodes and keeps track of the maximum count.
 *
 * Algorithm:
 * 1. If the root is null, return 0.
 * 2. Initialize a queue and add the root node.
 * 3. For each level:
 *      a. Compute the number of nodes (queue size).
 *      b. Update the maximum width.
 *      c. Add left and right children to the queue.
 * 4. Return the maximum width found.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * @param root The root node of the binary tree.
 * @return The maximum width of the binary tree.
 */

public class WidthOfTree {

    public int widthofTree(TreeNode root){
        if(root == null){
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        int maxWidth = 0;

        while(!q.isEmpty()){
            int levelsize = q.size();

            maxWidth = Math.max(maxWidth,levelsize);
            for(int i=0;i<levelsize;i++){
                TreeNode curr = q.poll();

                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }

        }
        return maxWidth;

    }
    
}
