package BinaryTree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewOfBinaryTree {
    static class Pairs {
        Node node;
        int hd;

        public Pairs(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public void BottomView(Node root) {
        Queue<Pairs> q = new LinkedList<>();
        Map<Integer, Integer> bottomViewMap = new TreeMap<>();

        q.add(new Pairs(root, 0));

        while (!q.isEmpty()) {
            Pairs curr = q.remove();
            Node node = curr.node;
            int hd = curr.hd;

            bottomViewMap.put(hd, node.data);

            if (node.left != null) {
                q.add(new Pairs(node.left, hd - 1));
            }
            if (node.right != null) {
                q.add(new Pairs(node.right, hd + 1));
            }
        }
        System.out.print("Top View: ");
        for (int data : bottomViewMap.values()) {
            System.out.print(data + " ");
        }
        System.out.println();
    }
}
