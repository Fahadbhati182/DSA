package BinaryTree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class TopVIewOfBinaryTree {
    static class Pair {
        Node node;
        int hd;

        public Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public void TopView(Node root) {
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> topViewMap = new TreeMap<>();

        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair curr = q.remove();
            Node node = curr.node;
            int hd = curr.hd;

            if (!topViewMap.containsKey(curr.hd)) {
                topViewMap.put(hd, node.data);
            }

            if (node.left != null) {
                q.add(new Pair(node.left, hd - 1));
            }
            if (node.right != null) {
                q.add(new Pair(node.right, hd + 1));
            }
        }
        System.out.print("Top View: ");
        for (int data : topViewMap.values()) {
            System.out.print(data + " ");
        }
        System.out.println();
    }



}
