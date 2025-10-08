package BinarySearchTrees;

public class DeleteNodeInBST {
    public static TreeNode deleteNode(TreeNode root, int val) {
        if (root == null) return null;

        if (root.val > val) {
            root.left = deleteNode(root.left, val);
        } else if (root.val < val) {
            root.right = deleteNode(root.right, val);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode successor = findMin(root.right);
                root.val = successor.val;
                root.right = deleteNode(root.right, successor.val);
            }

        }
        return root;

    }

    private static TreeNode findMin(TreeNode node) {
        while (node != null && node.left != null) {
            node = node.left;
        }
        return node;
    }
}
