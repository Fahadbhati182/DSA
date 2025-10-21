package BinaryTree;

public class IdenticalBinaryTree {

    public static boolean isIdentical(Node root1, Node root2) {

        if (root1 == null || root2 == null) {
            return root1 == root2;
        }

        boolean leftIdentical = isIdentical(root1.left, root2.left);
        boolean rightIdentical = isIdentical(root1.right, root2.right);

        return leftIdentical && rightIdentical && root2.data == root1.data;
    }
}
