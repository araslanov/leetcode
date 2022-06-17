package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution236Test {

    private Solution236 solution;

    @Before
    public void setUp() {
        solution = new Solution236();
    }

    @Test
    public void test1() {
        Solution236.TreeNode root = new Solution236.TreeNode(3);
        root.left = new Solution236.TreeNode(5);
        root.left.left = new Solution236.TreeNode(6);
        root.left.right = new Solution236.TreeNode(2);
        root.left.right.left = new Solution236.TreeNode(7);
        root.left.right.right = new Solution236.TreeNode(4);
        root.right = new Solution236.TreeNode(1);
        root.right.left = new Solution236.TreeNode(0);
        root.right.right = new Solution236.TreeNode(8);

        assertEquals(root, solution.lowestCommonAncestor(root, root.left, root.right));
    }

    @Test
    public void test2() {
        Solution236.TreeNode root = new Solution236.TreeNode(3);
        root.left = new Solution236.TreeNode(5);
        root.left.left = new Solution236.TreeNode(6);
        root.left.right = new Solution236.TreeNode(2);
        root.left.right.left = new Solution236.TreeNode(7);
        root.left.right.right = new Solution236.TreeNode(4);
        root.right = new Solution236.TreeNode(1);
        root.right.left = new Solution236.TreeNode(0);
        root.right.right = new Solution236.TreeNode(8);

        assertEquals(root.left, solution.lowestCommonAncestor(root, root.left, root.left.right.right));
    }

    @Test
    public void test3() {
        Solution236.TreeNode root = new Solution236.TreeNode(3);
        root.left = new Solution236.TreeNode(5);
        root.left.left = new Solution236.TreeNode(6);
        root.left.right = new Solution236.TreeNode(2);
        root.left.right.left = new Solution236.TreeNode(7);
        root.left.right.right = new Solution236.TreeNode(4);
        root.right = new Solution236.TreeNode(1);
        root.right.left = new Solution236.TreeNode(0);
        root.right.right = new Solution236.TreeNode(8);

        assertEquals(root.left, solution.lowestCommonAncestor(root, root.left.left, root.left.right.right));
    }

    @Test
    public void test4() {
        Solution236.TreeNode root = new Solution236.TreeNode(3);
        root.left = new Solution236.TreeNode(5);
        root.left.left = new Solution236.TreeNode(6);
        root.left.right = new Solution236.TreeNode(2);
        root.left.right.left = new Solution236.TreeNode(7);
        root.left.right.right = new Solution236.TreeNode(4);
        root.right = new Solution236.TreeNode(1);
        root.right.left = new Solution236.TreeNode(0);
        root.right.right = new Solution236.TreeNode(8);

        assertEquals(root, solution.lowestCommonAncestor(root, root.left.left, root.right.left));
    }
}
