package com.wizeek.leetcode.p938;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        Solution.TreeNode root = new Solution.TreeNode(10);
        root.left = new Solution.TreeNode(5);
        root.left.left = new Solution.TreeNode(3);
        root.left.right = new Solution.TreeNode(7);
        root.right = new Solution.TreeNode(15);
        root.right.right = new Solution.TreeNode(18);

        assertEquals(32, solution.rangeSumBST(root, 7, 15));
    }

    @Test
    public void test2() {
        Solution.TreeNode root = new Solution.TreeNode(10);
        root.left = new Solution.TreeNode(5);
        root.left.left = new Solution.TreeNode(3);
        root.left.left.left = new Solution.TreeNode(1);
        root.left.right = new Solution.TreeNode(7);
        root.left.right.left = new Solution.TreeNode(6);
        root.right = new Solution.TreeNode(15);
        root.right.left = new Solution.TreeNode(13);
        root.right.right = new Solution.TreeNode(18);

        assertEquals(23, solution.rangeSumBST(root, 6, 10));
    }
}
