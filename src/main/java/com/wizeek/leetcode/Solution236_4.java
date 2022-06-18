package com.wizeek.leetcode;

import java.util.*;

public class Solution236_4 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Map<TreeNode, TreeNode> parents = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        parents.put(root, null);
        while (!parents.containsKey(p) || !parents.containsKey(q)) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
                parents.put(node.left, node);
            }
            if (node.right != null) {
                queue.add(node.right);
                parents.put(node.right, node);
            }
        }
        Set<TreeNode> visited = new HashSet<>();
        while (p != null) {
            visited.add(p);
            p = parents.get(p);
        }
        while (!visited.contains(q)) {
            q = parents.get(q);
        }
        return q;
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
