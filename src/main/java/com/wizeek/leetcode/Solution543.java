package com.wizeek.leetcode;

public class Solution543 {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        int leftDepth = root.left == null ? 0 : root.left.val + 1;
        int rightDepth = root.right == null ? 0 : root.right.val + 1;
        root.val = Math.max(leftDepth, rightDepth);
        return Math.max(leftDepth + rightDepth, Math.max(leftDiameter, rightDiameter));
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
