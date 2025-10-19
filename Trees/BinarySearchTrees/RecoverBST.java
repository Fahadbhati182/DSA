package BinarySearchTrees;

public class RecoverBST {
    static TreeNode first = null;
    static TreeNode sec = null;
    static TreeNode prev = null;


    public static void recoverBST(TreeNode root) {
        inorder(root);
        int temp = first.val;
        first.val = sec.val;
        sec.val = temp;

    }

    private static void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        if (prev != null && prev.val > root.val) {
            if (first != null) {
                first = root;
            }
            sec = root;
        }

        prev = root;
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 6, 4, 9};
        BuildBST b = new BuildBST();
        TreeNode root = null;
        for (int val : arr) {
            root = b.insertElements(root, val);
        }

        recoverBST(root);
    }


}
