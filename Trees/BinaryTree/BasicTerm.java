package BinaryTree;

public class BasicTerm {


    public int height(Node root) {
        if (root == null) {
            return -1;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int countNoofNode(Node root) {

        if (root == null) {
            return 0;
        }

        int leftCount = countNoofNode(root.left);
        int rightCount = countNoofNode(root.right);

        return leftCount + rightCount + 1;
    }

    public int sumOfAllNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfAllNodes(root.left);
        int rightSum = sumOfAllNodes(root.right);
        return leftSum + rightSum + root.data;
    }


    public static void main(String[] args) {
        BuildBinaryTree buildBinaryTree = new BuildBinaryTree();
        int[] preorder = {10, 20, -1, -1, 30, 40, -1, -1, 50, -1, -1};
        Node root = buildBinaryTree.BuildTree(preorder);


        BasicTerm solver = new BasicTerm();

        // 1. Calculate Height
        int treeHeight = solver.height(root);
        System.out.println("1. Height of the tree (edges): " + treeHeight); // Expected: 2

        // 2. Count Nodes
        int nodeCount = solver.countNoofNode(root);
        System.out.println("2. Total number of nodes: " + nodeCount); // Expected: 5

        // 3. Sum of Nodes
        int totalSum = solver.sumOfAllNodes(root);
        System.out.println("3. Sum of all node data (10+20+30+40+50): " + totalSum); // Expected: 150
    }
}
