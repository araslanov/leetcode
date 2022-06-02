package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution897Test {

    private Solution897 solution;

    @Before
    public void setUp() {
        solution = new Solution897();
    }

    @Test
    public void test1() {
        Solution897.TreeNode root = new Solution897.TreeNode(5);
        root.left = new Solution897.TreeNode(1);
        root.right = new Solution897.TreeNode(7);

        Solution897.TreeNode result = solution.increasingBST(root);

        assertEquals(1, result.val);
        assertEquals(5, result.right.val);
        assertEquals(7, result.right.right.val);
    }

    @Test
    public void test2() {
        Solution897.TreeNode root = new Solution897.TreeNode(5);
        root.left = new Solution897.TreeNode(3);
        root.left.left = new Solution897.TreeNode(2);
        root.left.left.left = new Solution897.TreeNode(1);
        root.left.right = new Solution897.TreeNode(4);
        root.right = new Solution897.TreeNode(6);
        root.right.right = new Solution897.TreeNode(8);
        root.right.right.left = new Solution897.TreeNode(7);
        root.right.right.right = new Solution897.TreeNode(9);

        Solution897.TreeNode result = solution.increasingBST(root);

        assertEquals(1, result.val);
        assertEquals(2, result.right.val);
        assertEquals(3, result.right.right.val);
        assertEquals(4, result.right.right.right.val);
        assertEquals(5, result.right.right.right.right.val);
        assertEquals(6, result.right.right.right.right.right.val);
        assertEquals(7, result.right.right.right.right.right.right.val);
        assertEquals(8, result.right.right.right.right.right.right.right.val);
        assertEquals(9, result.right.right.right.right.right.right.right.right.val);
    }
}
