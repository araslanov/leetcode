package com.wizeek.leetcode.p697;

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
        assertEquals(2, solution.findShortestSubArray(new int[]{1, 2, 2, 3, 1}));
    }

    @Test
    public void test2() {
        assertEquals(6, solution.findShortestSubArray(new int[]{1, 2, 2, 3, 1, 4, 2}));
    }

    @Test
    public void test3() {
        assertEquals(1, solution.findShortestSubArray(new int[]{1}));
    }

    @Test
    public void test4() {
        assertEquals(4, solution.findShortestSubArray(new int[]{1, 2, 1, 1}));
    }

    @Test
    public void test5() {
        assertEquals(4, solution.findShortestSubArray(new int[]{1, 1, 1, 1}));
    }

    @Test
    public void test6() {
        assertEquals(7, solution.findShortestSubArray(new int[]{2, 1, 1, 2, 1, 3, 3, 3, 1, 3, 1, 3, 2}));
    }
}
