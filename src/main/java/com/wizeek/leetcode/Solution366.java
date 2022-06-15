package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution366 {
    public List<List<Integer>> findLeaves(TreeNode root) {
        LinkedList<Integer>[] nodes = new LinkedList[100];
        int max = dfs(nodes, root);
        List<List<Integer>> result = new LinkedList();
        for (int i = 0; i <= max; i++) {
            result.add(nodes[i]);
        }
        return result;
    }

    private int dfs(LinkedList<Integer>[] nodes, TreeNode node) {
        if (node == null) {
            return -1;
        }
        int left = dfs(nodes, node.left);
        int right = dfs(nodes, node.right);
        int current = Math.max(left, right) + 1;
        if (nodes[current] == null) {
            nodes[current] = new LinkedList<>();
        }
        nodes[current].add(node.val);
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
