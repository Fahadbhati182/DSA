package BinarySearchTrees;

public class LowestCommonAncestor {
    public static TreeNode LowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (root.val > p.val && root.val > q.val) {
            return LowestCommonAncestor(root.left, p, q);
        } else if (root.val < p.val && root.val < q.val) {
            return LowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
}
