package com.wizeek.leetcode;

import java.util.*;

public class Solution314_2 {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(0, root));
        while (!queue.isEmpty()) {
            Pair pair = queue.poll();
            int order = pair.order;
            TreeNode node = pair.node;
            if (node == null) {
                continue;
            }
            map.computeIfAbsent(order, key -> new LinkedList<>()).add(node.val);
            queue.offer(new Pair(order - 1, node.left));
            queue.offer(new Pair(order + 1, node.right));
        }
        List<List<Integer>> result = new LinkedList<>();
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            result.add(entry.getValue());
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
