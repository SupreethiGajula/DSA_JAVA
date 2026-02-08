package Trees;

import java.util.ArrayList;
import java.util.List;
/**
 * Prints all root-to-leaf paths in a binary tree.
 *
 * A root-to-leaf path is defined as a sequence of nodes
 * starting from the root node and ending at a leaf node
 * (a node with no left and right children).
 *
 * This method uses Depth-First Search (DFS) recursion
 * along with backtracking. A list is maintained to store
 * the current traversal path. When a leaf node is reached,
 * the path is printed.
 *
 * Algorithm:
 * 1. Add the current node to the path list.
 * 2. If the node is a leaf, print the path.
 * 3. Recursively traverse the left subtree.
 * 4. Recursively traverse the right subtree.
 * 5. Remove the current node from the path (backtracking).
 *
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 * where n = number of nodes, h = height of tree.
 *
 * @param root The root node of the binary tree.
 */


public class PrintAllPaths {
    public void printallpaths(TreeNode root){
        List<Integer> path = new ArrayList<>();
        findallpaths(root,path);
    }
    public void findallpaths(TreeNode root,List<Integer>path){
        if(root == null){
            return;
        }
        path.add(root.data);

        if(root.left==null&&root.right==null){
            System.out.println(path);
        }
        findallpaths(root.left,path);
        findallpaths(root.right,path);
        path.remove(path.size()-1);
    }
    
}
