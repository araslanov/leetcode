package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution104Test {

    private Solution104 solution;

    @Before
    public void setUp() {
        solution = new Solution104();
    }

    @Test
    public void test1() {
        Solution104.TreeNode root = new Solution104.TreeNode(3);
        root.left = new Solution104.TreeNode(9);
        root.right = new Solution104.TreeNode(20);
        root.right.left = new Solution104.TreeNode(15);
        root.right.right = new Solution104.TreeNode(7);

        assertEquals(3, solution.maxDepth(root));
    }

    @Test
    public void test2() {
        Solution104.TreeNode root = new Solution104.TreeNode(1);
        root.right = new Solution104.TreeNode(2);

        assertEquals(2, solution.maxDepth(root));
    }
}
