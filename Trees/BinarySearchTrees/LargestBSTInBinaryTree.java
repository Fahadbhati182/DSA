package BinarySearchTrees;

class Info {
    int min, max, sz;

    Info(int min, int max, int sz) {
        this.max = max;
        this.min = min;
        this.sz = sz;
    }
}

public class LargestBSTInBinaryTree {

    int largestBST(TreeNode root) {
        Info inf = helper(root);
        return inf.sz;
    }

    private Info helper(TreeNode root) {
        if (root == null) {
            return new Info(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        Info left = helper(root.left);
        Info right = helper(root.right);

        if (root.val > left.max && root.val < right.min) {
            int currMin = Math.min(root.val, left.min);
            int currMax = Math.min(root.val, right.max);
            int currSize = left.sz + right.sz + 1;
            return new Info(currMin, currMax, currSize);
        }

        return new Info(Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 6, 4, 9};
        BuildBST b = new BuildBST();
        TreeNode root = null;
        for (int val : arr) {
            root = b.insertElements(root, val);
        }


    }
}
