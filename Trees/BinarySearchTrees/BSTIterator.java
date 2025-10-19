package BinarySearchTrees;

import java.util.Stack;

public class BSTIterator {
    static Stack<TreeNode> s = new Stack<>();

    BSTIterator(TreeNode root) {
        storesNodeInStack(root);
    }

    private static void storesNodeInStack(TreeNode root) {
        while (root != null) {
            s.add(root);
            root = root.left;
        }
    }

    public static int next() {
        TreeNode curr = s.peek();
        s.pop();

        if (curr != null) {
            storesNodeInStack(curr.right);
        }
        return curr.val;

    }

    public static boolean hasNext() {
        return s.isEmpty();
    }
}
