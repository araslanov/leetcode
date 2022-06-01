package com.wizeek.leetcode;

public class Solution270 {
    public int closestValue(TreeNode root, double target) {
        int result = root.val;
        double minDelta = Double.MAX_VALUE;
        while (root != null) {
            double delta = Math.abs(root.val - target);
            if (delta < minDelta) {
                result = root.val;
                minDelta = delta;
            }
            root = target < root.val ? root.left : root.right;
        }
        return result;
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
