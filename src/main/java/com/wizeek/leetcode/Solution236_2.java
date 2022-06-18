package com.wizeek.leetcode;

public class Solution236_2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Wrapper wrapper = new Wrapper();
        dfs(root, p, q, wrapper);
        return wrapper.node;
    }

    private int dfs(TreeNode node, TreeNode p, TreeNode q, Wrapper wrapper) {
        if (wrapper.node != null) {
            return 2;
        }
        if (node == null) {
            return 0;
        }
        int score = 0;
        if (node == p || node == q) {
            score++;
        }
        score += dfs(node.left, p, q, wrapper);
        if (wrapper.node != null) {
            return 2;
        }
        if (score == 2) {
            wrapper.node = node;
            return 2;
        }
        score += dfs(node.right, p, q, wrapper);
        if (wrapper.node != null) {
            return 2;
        }
        if (score == 2) {
            wrapper.node = node;
            return 2;
        }
        return score;
    }

    private static class Wrapper {
        TreeNode node;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
