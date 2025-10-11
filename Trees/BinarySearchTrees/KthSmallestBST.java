package BinarySearchTrees;

public class KthSmallestBST {
    static int preorder = 0;

    public static int KthSmallest(TreeNode root, int k) {
        if (root == null) return -1;

        if (root.left != null) {
            int left = KthSmallest(root.left, k);
            if (left != -1) {
                return left;
            }
        }

        if (preorder + 1 == k) {
            return root.val;
        }
        preorder = preorder + 1;

        if (root.right != null) {
            int right = KthSmallest(root.right, k);
            if (right != -1) {
                return right;
            }
        }
        return -1;
    }
}
