package com.wizeek.leetcode.p1046;

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
        assertEquals(1, solution.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1}));
    }

    @Test
    public void test2() {
        assertEquals(1, solution.lastStoneWeight(new int[]{1}));
    }

    @Test
    public void test3() {
        assertEquals(3, solution.lastStoneWeight(new int[]{10, 9, 3, 7}));
    }
}
