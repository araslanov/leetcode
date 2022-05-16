package com.wizeek.leetcode.p136;

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
        assertEquals(1, solution.singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    public void test2() {
        assertEquals(4, solution.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    @Test
    public void test3() {
        assertEquals(1, solution.singleNumber(new int[]{1}));
    }
}
