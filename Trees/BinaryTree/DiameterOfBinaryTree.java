package BinaryTree;

public class DiameterOfBinaryTree {

    int ans = 0;

    public int height(Node root) {
        if (root == null) {
            return -1;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        ans = Math.max(leftHeight + rightHeight, ans);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int diameter(Node root) {
        height(root);
        return ans;
    }
}
