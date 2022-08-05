package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution1480Test {

    private Solution1480 solution;

    @Before
    public void setUp() {
        solution = new Solution1480();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 3, 6, 10}, solution.runningSum(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, solution.runningSum(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{3, 4, 6, 16, 17}, solution.runningSum(new int[]{3, 1, 2, 10, 1}));
    }
}
