package com.wizeek.leetcode.p53;

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
        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    public void test2() {
        assertEquals(1, solution.maxSubArray(new int[]{1}));
    }

    @Test
    public void test3() {
        assertEquals(23, solution.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }

    @Test
    public void test4() {
        assertEquals(-1, solution.maxSubArray(new int[]{-1}));
    }

    @Test
    public void test5() {
        assertEquals(-2, solution.maxSubArray(new int[]{-2, -5}));
    }
}
