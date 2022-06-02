package com.wizeek.leetcode;

public class Solution897 {
    public TreeNode increasingBST(TreeNode root) {
        return flatten(root)[0];
    }

    private TreeNode[] flatten(TreeNode node) {
        if (node == null) {
            return null;
        }
        TreeNode[] left = flatten(node.left);
        TreeNode head;
        if (left == null) {
            head = node;
        } else {
            head = left[0];
            left[1].right = node;
        }
        TreeNode tail;
        TreeNode[] right = flatten(node.right);
        if (right == null) {
            tail = node;
        } else {
            tail = right[1];
            node.right = right[0];
        }
        node.left = null;
        return new TreeNode[]{head, tail};
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
