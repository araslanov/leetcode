package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution226Test {

    private Solution226 solution;

    @Before
    public void setUp() {
        solution = new Solution226();
    }

    @Test
    public void test1() {
        Solution226.TreeNode root = new Solution226.TreeNode(4);
        root.left = new Solution226.TreeNode(2);
        root.left.left = new Solution226.TreeNode(1);
        root.left.right = new Solution226.TreeNode(3);
        root.right = new Solution226.TreeNode(7);
        root.right.left = new Solution226.TreeNode(6);
        root.right.right = new Solution226.TreeNode(9);

        assertEquals(root, solution.invertTree(root));
        assertEquals(root.left.val, 7);
    }
}
