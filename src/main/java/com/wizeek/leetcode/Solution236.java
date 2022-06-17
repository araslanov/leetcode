package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> found = new LinkedList<>();
        return dfs(root, p, q, found);
    }

    private TreeNode dfs(TreeNode node, TreeNode p, TreeNode q, List<TreeNode> found) {
        if (node == null) {
            return null;
        }
        int initial = found.size();
        TreeNode left = dfs(node.left, p, q, found);
        if (left != null) {
            return left;
        }
        if (found.size() == 2) {
            return null;
        }
        TreeNode right = dfs(node.right, p, q, found);
        if (right != null) {
            return right;
        }
        if (found.size() == 2 && initial == 0) {
            return node;
        }
        boolean match = node == p || node == q;
        if (found.size() == 1 && match && initial == 0) {
            return node;
        }
        if (match) {
            found.add(node);
        }
        return null;
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
