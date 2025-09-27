package Trees.BinaryTrees;

class Node {
  int data;
  Node left;
  Node right;

  public Node(int val) {
    this.data = val;
    this.left = null;
    this.right = null;
  }
}

public class BuildTree {

  static int idx = -1;

  public static Node buildTree(int[] preorder) {
    idx++;
    if (preorder[idx] == -1) {
      return null;
    }
    Node newNode = new Node(preorder[idx]);
    newNode.left = buildTree(preorder);
    newNode.right = buildTree(preorder);
    return newNode;
  }

  public static void main(String[] args) {
    int[] preorder = { 1, 2, -1, -1, 3, 4, 5, -1, -1, -1, -1 };
    Node root = buildTree(preorder);
    System.out.println(root.data); // Output: 1
  }

}
