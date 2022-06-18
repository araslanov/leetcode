package com.wizeek.leetcode;

public class Solution236_3 {
    private Node pChain;
    private Node qChain;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q, new Node(root, null));
        Node left = pChain;
        Node right = qChain;
        while (left != right) {
            left = left.next == null ? qChain : left.next;
            right = right.next == null ? pChain : right.next;
        }
        return left.value;
    }

    private void dfs(TreeNode treeNode, TreeNode p, TreeNode q, Node parent) {
        if (treeNode == null) {
            return;
        }
        Node node = new Node(treeNode, parent);
        if (treeNode == p) {
            pChain = node;
        }
        if (pChain != null && qChain != null) {
            return;
        }
        if (treeNode == q) {
            qChain = node;
        }
        if (pChain != null && qChain != null) {
            return;
        }
        dfs(treeNode.left, p, q, node);
        dfs(treeNode.right, p, q, node);
    }

    private static class Node {
        TreeNode value;
        Node next;

        Node(TreeNode value, Node next) {
            this.value = value;
            this.next = next;
        }
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
