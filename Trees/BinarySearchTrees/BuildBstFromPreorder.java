package BinarySearchTrees;

public class BuildBstFromPreorder {
    static int i = 0;

    public static void main(String[] args) {
        int[] num = {6, 3, 1, 4, 8, 9};
        int bound = Integer.MAX_VALUE;
        TreeNode root = buildBSTFromPreorder(num, bound);
        printInOrder(root); // to check
    }

    public static TreeNode buildBSTFromPreorder(int[] num, int bound) {
        if (i >= num.length || num[i] > bound) {
            return null;
        }

        TreeNode root = new TreeNode(num[i]);
        i++;

        root.left = buildBSTFromPreorder(num, root.val);
        root.right = buildBSTFromPreorder(num, bound);
        return root;
    }

    private static void printInOrder(TreeNode root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
}
