package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2104Test {

    private Solution2104 solution;

    @Before
    public void setUp() {
        solution = new Solution2104();
    }

    @Test
    public void test1() {
        assertEquals(4, solution.subArrayRanges(new int[]{1, 2, 3}));
    }

    @Test
    public void test2() {
        assertEquals(4, solution.subArrayRanges(new int[]{1, 3, 3}));
    }

    @Test
    public void test3() {
        assertEquals(59, solution.subArrayRanges(new int[]{4, -2, -3, 4, 1}));
    }
}
