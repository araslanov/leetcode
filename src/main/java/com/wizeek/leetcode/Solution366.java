package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution366 {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> result = new LinkedList();
        dfs(result, root);
        return result;
    }

    private int dfs(List<List<Integer>> nodes, TreeNode node) {
        if (node == null) {
            return -1;
        }
        int left = dfs(nodes, node.left);
        int right = dfs(nodes, node.right);
        int current = Math.max(left, right) + 1;
        if (nodes.size() == current) {
            nodes.add(new LinkedList<>());
        }
        nodes.get(current).add(node.val);
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
