package com.wizeek.leetcode.p938;

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        int currentVal = root.val;
        if (currentVal < low) {
            sum += rangeSumBST(root.right, low, high);
        } else if (currentVal > high) {
            sum += rangeSumBST(root.left, low, high);
        } else {
            sum = currentVal;
            sum += rangeSumBST(root.left, low, high);
            sum += rangeSumBST(root.right, low, high);
        }
        return sum;
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