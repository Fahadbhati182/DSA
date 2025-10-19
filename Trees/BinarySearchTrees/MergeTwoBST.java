package BinarySearchTrees;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoBST {
    private static void mergeTwoBst(TreeNode root1, TreeNode root2) {
        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();

        inorderTraversal(root1, num1);
        inorderTraversal(root2, num2);

        List<Integer> mergedArray = mergeTwoSortedArray(num1, num2);

        int i = 0;
        int[] ans = new int[mergedArray.size()];
        for (int val : mergedArray) {
            ans[i] = val;
        }

        BuildBSTFromSortedArray b = new BuildBSTFromSortedArray();
        TreeNode root = b.BuildTreeFromSortedArray(ans, 0, mergedArray.size() - 1);
        System.out.println("The merge root node is " + root.val);
    }

    private static List<Integer> mergeTwoSortedArray(List<Integer> num1, List<Integer> num2) {
        int n = num1.size();
        int m = num2.size();
        List<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;

        // Merge like merge step in merge sort
        while (i < n && j < m) {
            if (num1.get(i) < num2.get(j)) {
                ans.add(num1.get(i));
                i++;
            } else {
                ans.add(num2.get(j));
                j++;
            }
        }

        // Add remaining elements
        while (i < n) {
            ans.add(num1.get(i));
            i++;
        }
        while (j < m) {
            ans.add(num2.get(j));
            j++;
        }
        return ans;


    }

    private static void inorderTraversal(TreeNode root, List<Integer> num) {
        if (root == null) return;

        inorderTraversal(root.left, num);
        num.add(root.val);
        inorderTraversal(root.right, num);
    }

    public static void main(String[] args) {
        BuildBSTFromSortedArray b = new BuildBSTFromSortedArray();
        int[] num1 = {1, 2, 8, 10};
        TreeNode root1 = b.BuildTreeFromSortedArray(num1, 0, num1.length - 1);
        int[] num2 = {0, 3, 5};
        TreeNode root2 = b.BuildTreeFromSortedArray(num2, 0, num2.length - 1);

        mergeTwoBst(root1, root2);
    }

}
