package BinarySearchTrees;

public class BuildBSTFromSortedArray {
    public TreeNode BuildTreeFromSortedArray(int[] nums, int st, int end) {
        if (st > end) return null;

        int mid = st + (end - st) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = BuildTreeFromSortedArray(nums, st, mid - 1);
        root.right = BuildTreeFromSortedArray(nums, mid + 1, end);

        return root;

    }
}
