package com.wizeek.leetcode;

import java.util.*;

public class Solution314_2 {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(0, root));
        int min = 0;
        int max = 0;
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            int order = pair.order;
            TreeNode node = pair.node;
            if (node == null) {
                continue;
            }
            min = Math.min(min, order);
            max = Math.max(max, order);
            map.computeIfAbsent(order, key -> new LinkedList<>()).add(node.val);
            queue.offer(new Pair(order - 1, node.left));
            queue.offer(new Pair(order + 1, node.right));
        }
        for (int i = min; i <= max; i++) {
            result.add(map.get(i));
        }
        return result;
    }

    private static class Pair {
        int order;
        TreeNode node;

        Pair(int order, TreeNode node) {
            this.order = order;
            this.node = node;
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
