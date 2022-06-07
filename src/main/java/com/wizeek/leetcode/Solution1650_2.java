package com.wizeek.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution1650_2 {
    public Node lowestCommonAncestor(Node p, Node q) {
        Set<Node> visitedLeft = new HashSet<>();
        Set<Node> visitedRight = new HashSet<>();
        while (p != null || q != null) {
            if (p != null) {
                visitedLeft.add(p);
            }
            if (q != null) {
                visitedRight.add(q);
            }
            if (p != null && visitedRight.contains(p)) {
                return p;
            }
            if (q != null && visitedLeft.contains(q)) {
                return q;
            }
            if (p != null) {
                p = p.parent;
            }
            if (q != null) {
                q = q.parent;
            }
        }
        return null;
    }

    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node parent;

        Node(int val) {
            this.val = val;
        }
    }
}
