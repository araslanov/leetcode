package com.wizeek.leetcode.p1413;

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
        assertEquals(5, solution.minStartValue(new int[]{-3, 2, -3, 4, 2}));
    }

    @Test
    public void test2() {
        assertEquals(1, solution.minStartValue(new int[]{1, 2}));
    }

    @Test
    public void test3() {
        assertEquals(5, solution.minStartValue(new int[]{1, -2, -3}));
    }
}
