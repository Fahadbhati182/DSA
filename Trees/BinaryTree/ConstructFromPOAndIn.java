package BinaryTree;

public class ConstructFromPOAndIn {

    public static Node BuildTree(int[] P, int[] I, int preIdx, int left, int right) {
        if (left > right) return null;

        Node root = new Node(P[preIdx]);
        preIdx++;

        int inIdx = searchForValInInorder(I, left, right, root.data);

        root.left = BuildTree(P, I, preIdx, left, inIdx - 1);
        root.right = BuildTree(P, I, preIdx, inIdx + 1, right);
        return root;

    }

    private static int searchForValInInorder(int[] I, int left, int right, int data) {
        for (int i = left; i <= right; i++) {
            if (I[i] == data) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        int preIdx = 0;
        int left = 0, right = inorder.length - 1;

        Node root = BuildTree(preorder, inorder, preIdx, left, right);
        System.out.println(root);
    }

}
