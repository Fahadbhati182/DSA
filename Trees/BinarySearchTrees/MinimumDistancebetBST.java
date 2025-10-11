package BinarySearchTrees;

public class MinimumDistancebetBST {
    static TreeNode prev = null;

    public static int minimumdistancebetBST(TreeNode root) {
        int ans = Integer.MAX_VALUE; // should start with MAX_VALUE, not MIN_VALUE
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        // Left subtree
        if (root.left != null) {
            int leftMin = minimumdistancebetBST(root.left);
            ans = Math.min(ans, leftMin);
        }

        // Compare with previous node
        if (prev != null) {
            ans = Math.min(ans, root.val - prev.val);
        }
        prev = root;

        // Right subtree
        if (root.right != null) {
            int rightMin = minimumdistancebetBST(root.right);
            ans = Math.min(ans, rightMin);
        }

        return ans;

    }
}
