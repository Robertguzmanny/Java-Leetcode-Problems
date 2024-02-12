import java.util.HashMap;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Binary {
    public Map<Integer, Integer> countNodes(TreeNode root) {
        Map<Integer, Integer> nodeCount = new HashMap<>();
        traverseTree(root, nodeCount);
        return nodeCount;
    }

    private void traverseTree(TreeNode node, Map<Integer, Integer> nodeCount) {
        if (node == null) {
            return;
        }

        // Increment the count for the current node's value in the map.
        nodeCount.put(node.val, nodeCount.getOrDefault(node.val, 0) + 1);

        // Recursively traverse the left and right subtrees.
        traverseTree(node.left, nodeCount);
        traverseTree(node.right, nodeCount);
    }

    public static void main(String[] args) {
        // Constructing a binary tree that matches the desired output
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        Binary solution = new Binary();
        Map<Integer, Integer> result = solution.countNodes(root);
        System.out.println(result); // This should print {2: 2, 1: 1, 3: 1, 4: 1}
    }

}
