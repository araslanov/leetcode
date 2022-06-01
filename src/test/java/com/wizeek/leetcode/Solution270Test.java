package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution270Test {

    private Solution270 solution;

    @Before
    public void setUp() {
        solution = new Solution270();
    }

    @Test
    public void test1() {
        Solution270.TreeNode root = new Solution270.TreeNode(4);
        root.left = new Solution270.TreeNode(2);
        root.left.left = new Solution270.TreeNode(1);
        root.left.right = new Solution270.TreeNode(3);
        root.right = new Solution270.TreeNode(5);

        assertEquals(4, solution.closestValue(root, 3.714286f));
    }
}
