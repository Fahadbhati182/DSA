package BinaryTree;

public class KthLevelOfBinaryTree {

    private static void kthLeverl(Node root, int k) {
        if (root == null) {
            return;
        }

        if (k == 1) {
            System.out.println(root.data + " ");
            return;
        }
        kthLeverl(root.left, k - 1);
        kthLeverl(root.right, k - 1);
    }

    public static void main(String[] args) {
        int k = 4;
        int[] preorder = {1, 2, 7, -1, -1, -1, 3, 4, -1, -1, 5, 6, -1, -1, -1};
        BuildBinaryTree buildBinaryTree = new BuildBinaryTree();
        Node root = buildBinaryTree.BuildTree(preorder);
        kthLeverl(root, k);
    }
}
