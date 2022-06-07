package com.wizeek.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution1650 {
    public Node lowestCommonAncestor(Node p, Node q) {
        Set<Node> visited = new HashSet<>();
        while (p != null) {
            visited.add(p);
            p = p.parent;
        }
        while (q != null) {
            if (visited.contains(q)) {
                return q;
            }
            q = q.parent;
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
