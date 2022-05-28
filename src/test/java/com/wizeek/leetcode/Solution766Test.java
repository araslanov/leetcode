package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution766Test {

    private Solution766 solution;

    @Before
    public void setUp() {
        solution = new Solution766();
    }

    @Test
    public void test1() {
        assertEquals(true, solution.isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}));
    }

    @Test
    public void test2() {
        assertEquals(false, solution.isToeplitzMatrix(new int[][]{{1, 2}, {2, 2}}));
    }
}
