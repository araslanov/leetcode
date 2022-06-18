package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution236_2Test {

    private Solution236_2 solution;

    @Before
    public void setUp() {
        solution = new Solution236_2();
    }

    @Test
    public void test1() {
        Solution236_2.TreeNode root = new Solution236_2.TreeNode(3);
        root.left = new Solution236_2.TreeNode(5);
        root.left.left = new Solution236_2.TreeNode(6);
        root.left.right = new Solution236_2.TreeNode(2);
        root.left.right.left = new Solution236_2.TreeNode(7);
        root.left.right.right = new Solution236_2.TreeNode(4);
        root.right = new Solution236_2.TreeNode(1);
        root.right.left = new Solution236_2.TreeNode(0);
        root.right.right = new Solution236_2.TreeNode(8);

        assertEquals(root, solution.lowestCommonAncestor(root, root.left, root.right));
    }

    @Test
    public void test2() {
        Solution236_2.TreeNode root = new Solution236_2.TreeNode(3);
        root.left = new Solution236_2.TreeNode(5);
        root.left.left = new Solution236_2.TreeNode(6);
        root.left.right = new Solution236_2.TreeNode(2);
        root.left.right.left = new Solution236_2.TreeNode(7);
        root.left.right.right = new Solution236_2.TreeNode(4);
        root.right = new Solution236_2.TreeNode(1);
        root.right.left = new Solution236_2.TreeNode(0);
        root.right.right = new Solution236_2.TreeNode(8);

        assertEquals(root.left, solution.lowestCommonAncestor(root, root.left, root.left.right.right));
    }

    @Test
    public void test3() {
        Solution236_2.TreeNode root = new Solution236_2.TreeNode(3);
        root.left = new Solution236_2.TreeNode(5);
        root.left.left = new Solution236_2.TreeNode(6);
        root.left.right = new Solution236_2.TreeNode(2);
        root.left.right.left = new Solution236_2.TreeNode(7);
        root.left.right.right = new Solution236_2.TreeNode(4);
        root.right = new Solution236_2.TreeNode(1);
        root.right.left = new Solution236_2.TreeNode(0);
        root.right.right = new Solution236_2.TreeNode(8);

        assertEquals(root.left, solution.lowestCommonAncestor(root, root.left.left, root.left.right.right));
    }

    @Test
    public void test4() {
        Solution236_2.TreeNode root = new Solution236_2.TreeNode(3);
        root.left = new Solution236_2.TreeNode(5);
        root.left.left = new Solution236_2.TreeNode(6);
        root.left.right = new Solution236_2.TreeNode(2);
        root.left.right.left = new Solution236_2.TreeNode(7);
        root.left.right.right = new Solution236_2.TreeNode(4);
        root.right = new Solution236_2.TreeNode(1);
        root.right.left = new Solution236_2.TreeNode(0);
        root.right.right = new Solution236_2.TreeNode(8);

        assertEquals(root, solution.lowestCommonAncestor(root, root.left.left, root.right.left));
    }
}
