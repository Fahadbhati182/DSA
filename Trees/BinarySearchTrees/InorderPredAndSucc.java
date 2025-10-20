package BinarySearchTrees;

import java.util.ArrayList;
import java.util.List;

public class InorderPredAndSucc {

    public static List<Integer> inorderPredecessorAndSuccessor(TreeNode root, int key) {
        TreeNode curr = root;
        TreeNode pred = null;
        TreeNode succ = null;
        List<Integer> ans = new ArrayList<>();

        while (curr != null) {
            if (key < curr.val) {
                succ = curr;
                curr = curr.left;
            } else if (key > curr.val) {
                pred = curr;
                curr = curr.right;
            } else {
                if (curr.left != null) {
                    pred = rightMostLeft(curr.left);
                }
                if (curr.right != null) {
                    succ = leftMostRight(curr.right);
                }
                break;
            }
        }
        ans.add(pred.val);
        ans.add(succ.val);

        return ans;

    }

    private static TreeNode leftMostRight(TreeNode right) {
        TreeNode ans = null;
        while (right != null) {
            ans = right;
            right = right.right;
        }
        return ans;
    }

    private static TreeNode rightMostLeft(TreeNode left) {
        TreeNode ans = null;
        while (left != null) {
            ans = left;
            left = left.left;
        }
        return ans;
    }

    public static TreeNode insertElements(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        if (val < root.val) {
            root.left = insertElements(root.left, val);
        } else {
            root.right = insertElements(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        TreeNode root = null;
        for (int val : arr) {
            root = insertElements(root, val);
        }
        List<Integer> ans = inorderPredecessorAndSuccessor(root, 4);
        for (int val : ans) {
            System.out.println(val);
        }
    }
}
