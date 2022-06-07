package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1650_2Test {

    private Solution1650_2 solution;

    @Before
    public void setUp() {
        solution = new Solution1650_2();
    }

    @Test
    public void test1() {
        Solution1650_2.Node root = new Solution1650_2.Node(3);
        root.left = new Solution1650_2.Node(5);
        root.left.parent = root;
        root.left.left = new Solution1650_2.Node(6);
        root.left.left.parent = root.left;
        root.left.right = new Solution1650_2.Node(2);
        root.left.right.parent = root.left;
        root.right = new Solution1650_2.Node(1);
        root.right.parent = root;
        root.right.left = new Solution1650_2.Node(0);
        root.right.left.parent = root.right;
        root.right.right = new Solution1650_2.Node(8);
        root.right.right.parent = root.right;

        assertEquals(root, solution.lowestCommonAncestor(root.left, root.right));
    }
}
