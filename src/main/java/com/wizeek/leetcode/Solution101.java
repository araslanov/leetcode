package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root.left == null && root.right == null) {
            return true;
        } else if (root.left == null || root.right == null) {
            return false;
        }
        queue.add(root.left);
        queue.add(root.right);
        while (queue.size() > 0) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left.val != right.val) {
                return false;
            }
            if (left.left != null && right.right != null) {
                queue.add(left.left);
                queue.add(right.right);
            } else if (left.left == null && right.right == null) {
                // do nothing but don't continue as we need the check for other pair below
            } else {
                return false;
            }
            if (left.right != null && right.left != null) {
                queue.add(left.right);
                queue.add(right.left);
            } else if (left.right == null && right.left == null) {
                continue;
            } else {
                return false;
            }
        }
        return true;
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
