package BinaryTree;

public class SubTreeOfBT {

    public boolean isSubTree(Node p, Node q) {
        if (p == null || q == null) {
            return q == p;
        }

        if (p.data == q.data && IdenticalBinaryTree.isIdentical(p, q)) {
            return true;
        }

        return isSubTree(p.left, q.left) || isSubTree(p.right, q.right);

    }
}
