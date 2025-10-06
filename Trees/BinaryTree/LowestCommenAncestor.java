package BinaryTree;

public class LowestCommenAncestor {

    public static Node lowestCommanAncestor(Node root, Node p, Node q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        Node leftAncestor = lowestCommanAncestor(root.left, p, q);
        Node rightAncestor = lowestCommanAncestor(root.right, p, q);

        if (leftAncestor != null && rightAncestor != null) {
            return rightAncestor;
        } else if (leftAncestor != null) {
            return leftAncestor;
        } else {
            return rightAncestor;
        }
    }

    public static void main(String[] args) {
        BuildBinaryTree b = new BuildBinaryTree();
        Node root = b.getBinaryTree();
        Node p = new Node(6);
        Node q = new Node(4);
        Node common = lowestCommanAncestor(root, p, q);
        System.out.println("The  lowest common ancestor of " + p.data + " and " + q.data + " is " + common);
    }
}
