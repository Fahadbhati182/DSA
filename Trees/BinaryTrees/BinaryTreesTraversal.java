package Trees.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreesTraversal {
  public static void preOrder(Node root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preOrder(root.left);
    preOrder(root.right);
  }

  public static void inOrder(Node root) {
    if (root == null) {
      return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
  }

  public static void postOrder(Node root) {
    if (root == null) {
      return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data + " ");
  }

  public static void levelOrder(Node root) {
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);

    while (!q.isEmpty()) {
      Node curr = q.remove();
      if (curr == null) {
        if (q.isEmpty()) {
          break;
        } else {
          System.out.println();
          q.add(null);
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
    int[] preorder = { 1, 2, -1, -1, 3, 4,  -1, -1,5, -1, -1 };
    BuildTree idx = new BuildTree();
    Node root = idx.buildTree(preorder);

    // System.out.println("Preorder Traversal:");
    // preOrder(root); // Output: 1 2 -1 -1 3 4 -1 -1 5 -1 -1
    // System.out.println();

    // System.out.println("Inorder Traversal:");
    // inOrder(root); // Output: -1 2 -1 1 -1 4 -1 3 -1 5 -1
    // System.out.println();

    // System.out.println("Postorder Traversal:");
    // postOrder(root); // Output: -1 -1 2 -1 -1 4 -1 5 3 1
    // System.out.println();

    System.out.println("Level Order Traversal:");
    levelOrder(root);
  }
}
