package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeTraversal {

    public void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public void LevelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.remove();

            if (curr == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                    continue;
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }


    public static void main(String[] args) {
        BinaryTreeTraversal tree = new BinaryTreeTraversal();

        // Construct the following tree:
        //       1
        //     /   \
        //    2     3
        //   / \   /
        //  4   5 6

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);

        System.out.println("Tree Structure: ");

        System.out.println("\n--- Traversal Results ---");

        System.out.print("Preorder Traversal (Root, Left, Right): ");
        tree.preorder(root);
        // Expected output: 1 2 4 5 3 6

        System.out.print("\nInorder Traversal (Left, Root, Right): ");
        tree.inorder(root);
        // Expected output: 4 2 5 1 6 3

        System.out.print("\nPostorder Traversal (Left, Right, Root): ");
        tree.postorder(root);
        // Expected output: 4 5 2 6 3 1

        System.out.println("\n-------------------------");
    }
}