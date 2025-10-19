package BinarySearchTrees;

import java.util.LinkedList;
import java.util.Queue;

class BSTNode {
    BSTNode left;
    BSTNode right;
    BSTNode next;
    int val;

    public BSTNode(int data) {
        this.val = data;
        this.right = null;
        this.next = null;
        this.left = null;
    }
}

public class PopulateNextRightPointer {
    static BSTNode prev = null;

    private static void populatenextRightPointer(BSTNode root) {
        Queue<BSTNode> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            BSTNode curr = q.poll();

            if (curr == null) {
                if (q.isEmpty()) break;
                q.add(null);
            } else {
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (prev != null) {
                    prev.next = curr;
                }

            }
            prev = curr;
        }
        System.out.println("Finish...");
    }

    public static BSTNode insertElements(BSTNode root, int val) {
        if (root == null) return new BSTNode(val);

        if (val < root.val) {
            root.left = insertElements(root.left, val);
        } else {
            root.right = insertElements(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 6, 4, 9};
        BSTNode root = null;
        for (int val : arr) {
            root = insertElements(root, val);
        }
        populatenextRightPointer(root);
    }

}
