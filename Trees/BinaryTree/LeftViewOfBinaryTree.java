package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeftViewOfBinaryTree {

    public static List<Integer> rightViewOfBT(Node root) {
        Queue<Node> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        q.add(root);
        while (!q.isEmpty()) {
            int currSize = q.size();
            int first = 0;
            for (int i = 0; i < currSize; i++) {
                Node curr = q.remove();

                if (i == 0)
                    first = curr.data;

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }

            }
            list.add(first);

        }
        return list;

    }

    public static void main(String[] args) {
        BuildBinaryTree binaryTree = new BuildBinaryTree();
        Node root = binaryTree.getBinaryTree();
        List<Integer> ans = rightViewOfBT(root);
        for (int val : ans) {
            System.out.println(val);
        }
    }
}