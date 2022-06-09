package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution314Test {

    private Solution314 solution;

    @Before
    public void setUp() {
        solution = new Solution314();
    }

    @Test
    public void test1() {
        Solution314.TreeNode root = new Solution314.TreeNode(3);
        root.left = new Solution314.TreeNode(9);
        root.right = new Solution314.TreeNode(20);
        root.right.left = new Solution314.TreeNode(15);
        root.right.right = new Solution314.TreeNode(7);

        List<List<Integer>> result = solution.verticalOrder(root);

        assertEquals(4, result.size());
        assertEquals(9, (int) result.get(0).get(0));
        assertEquals(3, (int) result.get(1).get(0));
        assertEquals(15, (int) result.get(1).get(1));
    }

    @Test
    public void test2() {
        Solution314.TreeNode root = new Solution314.TreeNode(3);
        root.left = new Solution314.TreeNode(9);
        root.left.left = new Solution314.TreeNode(4);
        root.left.right = new Solution314.TreeNode(0);
        root.left.right.right = new Solution314.TreeNode(2);
        root.right = new Solution314.TreeNode(8);
        root.right.left = new Solution314.TreeNode(1);
        root.right.left.left = new Solution314.TreeNode(5);
        root.right.right = new Solution314.TreeNode(7);

        List<List<Integer>> result = solution.verticalOrder(root);

        assertEquals(5, result.size());
        assertEquals(3, (int) result.get(2).get(0));
        assertEquals(0, (int) result.get(2).get(1));
        assertEquals(1, (int) result.get(2).get(2));
        assertEquals(8, (int) result.get(3).get(0));
        assertEquals(2, (int) result.get(3).get(1));
    }
}
