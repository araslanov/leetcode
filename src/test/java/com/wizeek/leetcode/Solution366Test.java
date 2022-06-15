package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution366Test {

    private Solution366 solution;

    @Before
    public void setUp() {
        solution = new Solution366();
    }

    @Test
    public void test1() {
        Solution366.TreeNode root = new Solution366.TreeNode(1);
        root.left = new Solution366.TreeNode(2);
        root.left.left = new Solution366.TreeNode(4);
        root.left.right = new Solution366.TreeNode(5);
        root.right = new Solution366.TreeNode(3);

        List<List<Integer>> result = solution.findLeaves(root);

        assertEquals(3, result.size());
        assertEquals(4, (int) result.get(0).get(0));
        assertEquals(5, (int) result.get(0).get(1));
        assertEquals(3, (int) result.get(0).get(2));
        assertEquals(2, (int) result.get(1).get(0));
        assertEquals(1, (int) result.get(2).get(0));
    }
}
