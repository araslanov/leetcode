package com.wizeek.leetcode.p11;

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
        assertEquals(49, solution.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
