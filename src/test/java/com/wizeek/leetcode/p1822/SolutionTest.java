package com.wizeek.leetcode.p1822;

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
        assertEquals(1, solution.arraySign(new int[]{-1, -2, -3, -4, 3, 2, 1}));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.arraySign(new int[]{1, 5, 0, 2, -3}));
    }

    @Test
    public void test3() {
        assertEquals(-1, solution.arraySign(new int[]{-1, 1, -1, 1, -1}));
    }
}
