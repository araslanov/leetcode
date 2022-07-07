package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution226_2Test {

    private Solution226_2 solution;

    @Before
    public void setUp() {
        solution = new Solution226_2();
    }

    @Test
    public void test1() {
        Solution226_2.TreeNode root = new Solution226_2.TreeNode(4);
        root.left = new Solution226_2.TreeNode(2);
        root.left.left = new Solution226_2.TreeNode(1);
        root.left.right = new Solution226_2.TreeNode(3);
        root.right = new Solution226_2.TreeNode(7);
        root.right.left = new Solution226_2.TreeNode(6);
        root.right.right = new Solution226_2.TreeNode(9);

        assertEquals(root, solution.invertTree(root));
        assertEquals(root.left.val, 7);
    }
}
