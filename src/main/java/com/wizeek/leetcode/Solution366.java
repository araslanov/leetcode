package com.wizeek.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution366 {
    public List<List<Integer>> findLeaves(TreeNode root) {
        Map<Integer, List<Integer>> nodes = new HashMap<>();
        int max = dfs(nodes, root);
        List<List<Integer>> result = new LinkedList();
        for (int i = 0; i <= max; i++) {
            result.add(nodes.get(i));
        }
        return result;
    }

    private int dfs(Map<Integer, List<Integer>> nodes, TreeNode node) {
        if (node == null) {
            return -1;
        }
        int left = dfs(nodes, node.left);
        int right = dfs(nodes, node.right);
        int current = Math.max(left, right) + 1;
        nodes.computeIfAbsent(current, key -> new LinkedList<>()).add(node.val);
        return current;
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
