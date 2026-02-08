import java.util.*;

public class LongestPathPrinter {

    public void printLongestPath(TreeNode root) {
        List<Integer> longestPath = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();

        findLongest(root, currentPath, longestPath);

        System.out.println("Longest Path: " + longestPath);
    }

    private void findLongest(TreeNode node,
                             List<Integer> currentPath,
                             List<Integer> longestPath) {

        if (node == null) return;

        // Add current node
        currentPath.add(node.data);

        // If leaf node → check length
        if (node.left == null && node.right == null) {
            if (currentPath.size() > longestPath.size()) {
                longestPath.clear();
                longestPath.addAll(currentPath);
            }
        }

        // Recurse
        findLongest(node.left, currentPath, longestPath);
        findLongest(node.right, currentPath, longestPath);

        // Backtrack
        currentPath.remove(currentPath.size() - 1);
    }
}
