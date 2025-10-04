package BinaryTree;

public class MorrisInorderTraversal {
    public void morrisInorderTraversal(Node curr) {
        while (curr != null) {
            if (curr.left == null) {
                // Case 1: No left child, print and move right
                System.out.println(curr.data);
                curr = curr.right;
            } else {
                // Case 2: Find inorder predecessor
                Node IP = findInorderPredecessor(curr.left, curr);

                if (IP.right == null) {
                    // Make thread
                    IP.right = curr;
                    curr = curr.left;
                } else {
                    // Thread already exists → remove and visit
                    IP.right = null;
                    System.out.println(curr.data);
                    curr = curr.right;
                }
            }
        }
    }

    private Node findInorderPredecessor(Node node, Node curr) {
        while (node.right != null && node.right != curr) {
            node = node.right;
        }
        return node;
    }
}
