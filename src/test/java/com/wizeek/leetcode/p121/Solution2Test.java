package com.wizeek.leetcode.p121;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {

    private Solution2 solution;

    @Before
    public void setUp() {
        solution = new Solution2();
    }

    @Test
    public void test1() {
        assertEquals(7, solution.getMaxProfit(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.getMaxProfit(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.getMaxProfit(new int[]{1}));
    }

    @Test
    public void test4() {
        assertEquals(0, solution.getMaxProfit(new int[]{}));
    }

    @Test
    public void test5() {
        assertEquals(7, solution.getMaxProfit(new int[]{8, 6, 2, 5, 4, 1, 8, 3, 7}));
    }

    @Test
    public void test6() {
        assertEquals(4, solution.getMaxProfit(new int[]{1, 2, 3, 4, 5}));
    }
}
