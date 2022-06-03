package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution836Test {

    private Solution836 solution;

    @Before
    public void setUp() {
        solution = new Solution836();
    }

    @Test
    public void test1() {
        assertEquals(true, solution.isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3}));
    }

    @Test
    public void test2() {
        assertEquals(false, solution.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{1, 0, 2, 1}));
    }

    @Test
    public void test3() {
        assertEquals(false, solution.isRectangleOverlap(new int[]{0, 0, 1, 1}, new int[]{2, 2, 3, 3}));
    }
}
