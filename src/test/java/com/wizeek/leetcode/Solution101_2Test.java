package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution101_2Test {

    private Solution101 solution;

    @Before
    public void setUp() {
        solution = new Solution101();
    }

    @Test
    public void test1() {
        Solution101.TreeNode root = new Solution101.TreeNode(1);
        root.left = new Solution101.TreeNode(2);
        root.left.left = new Solution101.TreeNode(3);
        root.left.right = new Solution101.TreeNode(4);
        root.right = new Solution101.TreeNode(2);
        root.right.left = new Solution101.TreeNode(4);
        root.right.right = new Solution101.TreeNode(3);

        assertEquals(true, solution.isSymmetric(root));
    }

    @Test
    public void test2() {
        Solution101.TreeNode root = new Solution101.TreeNode(9);
        root.left = new Solution101.TreeNode(-42);
        root.left.right = new Solution101.TreeNode(76);
        root.left.right.right = new Solution101.TreeNode(13);
        root.right = new Solution101.TreeNode(-42);
        root.right.left = new Solution101.TreeNode(76);
        root.right.left.right = new Solution101.TreeNode(13);

        assertEquals(false, solution.isSymmetric(root));
    }
}
