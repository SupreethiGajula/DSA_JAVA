package Trees;

import java.util.LinkedList;
import java.util.Queue;
/**
 * Finds the maximum sum among all levels of a binary tree.
 *
 * This method performs a Level Order Traversal (Breadth-First Search)
 * using a queue to process the tree level by level. For each level,
 * it calculates the sum of node values and keeps track of the maximum
 * level sum encountered.
 *
 * Algorithm:
 * 1. If the root is null, return 0.
 * 2. Initialize a queue and add the root node.
 * 3. While the queue is not empty:
 *      a. Determine the number of nodes at the current level.
 *      b. Initialize a sum variable for the level.
 *      c. Dequeue each node of the level and add its value to sum.
 *      d. Enqueue the left and right children of each node.
 *      e. Update the maximum sum if the current level sum is greater.
 * 4. Return the maximum level sum.
 *
 * Time Complexity: O(n) — each node is visited once.
 * Space Complexity: O(n) — due to the queue used for traversal.
 *
 * @param root The root node of the binary tree.
 * @return The maximum sum of any level in the binary tree.
 */

public class LevelwithMaxSum {

    public int levelwithmaxsum(TreeNode root) {

        if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int maxSum = Integer.MIN_VALUE;

        while (!q.isEmpty()) {

            int levelSize = q.size();
            int sum = 0;   // reset for each level

            for (int i = 0; i < levelSize; i++) {

                TreeNode curr = q.poll();
                sum += curr.data;

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
