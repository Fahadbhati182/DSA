package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePath {
    public void allPaths(Node root, String path, List<String> ans) {
        if (root.left == null && root.right == null) {
            ans.add(path);
            return;
        }

        if (root.left != null) {
            allPaths(root.left, path + "->" + Integer.toString(root.left.data), ans);
        }

        if (root.right != null) {
            allPaths(root.right, path + "->" + Integer.toString(root.right.data), ans);
        }

    }


}
