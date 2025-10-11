package BinarySearchTrees;

public class BuildBST {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        TreeNode root = null;
        for (int val : arr) {
            root = insertElements(root, val);
        }
        System.out.println("The root element of BST is ---> " + root);
        System.out.println(ValidateBST.isBST(root, null, null));
    }

    private static TreeNode insertElements(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        if (val < root.val) {
            root.left = insertElements(root.left, val);
        } else {
            root.right = insertElements(root.right, val);
        }
        return root;
    }
}
