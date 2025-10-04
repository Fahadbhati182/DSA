package BinaryTree;

public class BuildBinaryTree {

    static int idx = -1;

    public Node BuildTree(int[] preorder) {
        idx++;
        if (preorder[idx] == -1) {
            return null;
        }
        Node root = new Node(preorder[idx]);
        root.left = BuildTree(preorder);
        root.right = BuildTree(preorder);
        return root;
    }

    public Node getBinaryTree(){
        int[] preorder = {1, 2, 7, -1, -1, -1, 3, 4, -1, -1, 5, 6, -1, -1, -1};
        return BuildTree(preorder);
    }

    public static void main(String[] args) {
        int[] preorder = {1, 2, 3, -1, -1, 4, -1, -1, 5, -1, 6, -1, -1};
        BuildBinaryTree b = new BuildBinaryTree();
        Node root = b.BuildTree(preorder);
    }
}
