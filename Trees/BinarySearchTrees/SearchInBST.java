package BinarySearchTrees;

public class SearchInBST {
    public static boolean search(TreeNode root, int val) {
        if (root == null) return false;

        if (root.val == val) {
            return true;
        }

        if (root.val > val) {
            return search(root.left, val);
        } else {        return search(root.right, val);

        }

    }
}
