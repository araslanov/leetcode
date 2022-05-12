package com.wizeek.leetcode.p70;

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
        assertEquals(2, solution.climbStairs(2));
    }

    @Test
    public void test2() {
        assertEquals(3, solution.climbStairs(3));
    }
}
