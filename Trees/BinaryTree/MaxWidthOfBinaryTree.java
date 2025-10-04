package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfBinaryTree {
    static class Pair {
        Node node;
        int idx;

        public Pair(Node node, int val) {
            this.node = node;
            this.idx = val;
        }
    }

    public int maxWidth(Node root) {
        Queue<Pair> q = new LinkedList<>();
        int maxWidth = 0;

        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            int currSize = q.size();
            int stIdx = q.peek().idx;
            int first = 0, last = 0;

            for (int i = 0; i < currSize; i++) {
                Pair curr = q.poll();
                int curIdx = curr.idx - stIdx; // normalize to prevent overflow

                if (i == 0) first = curIdx;
                if (i == currSize - 1) last = curIdx;

                if (curr.node.left != null) {
                    q.add(new Pair(curr.node.left, curIdx * 2 + 1));
                }
                if (curr.node.right != null) {
                    q.add(new Pair(curr.node.right, curIdx * 2 + 2));
                }
            }
            maxWidth = Math.max(maxWidth, last - first + 1);
        }
        return maxWidth;
    }

}