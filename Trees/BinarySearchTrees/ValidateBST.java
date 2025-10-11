package BinarySearchTrees;

public class ValidateBST {
    public static boolean isBST(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) return true;

        if (min != null && root.val <= min.val) {
            return false;
        }

        if (max != null && root.val >= max.val) {
            return false;
        }
        return isBST(root.left, min, root) && isBST(root.right, root, max);
    }
}
