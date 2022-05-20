package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution543Test {

    private Solution543 solution;

    @Before
    public void setUp() {
        solution = new Solution543();
    }

    @Test
    public void test1() {
        Solution543.TreeNode root = new Solution543.TreeNode();
        root.left = new Solution543.TreeNode();
        root.left.left = new Solution543.TreeNode();
        root.left.right = new Solution543.TreeNode();
        root.right = new Solution543.TreeNode();

        assertEquals(3, solution.diameterOfBinaryTree(root));
    }
}
