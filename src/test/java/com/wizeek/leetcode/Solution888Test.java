package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution888Test {

    private Solution888 solution;

    @Before
    public void setUp() {
        solution = new Solution888();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2}, solution.fairCandySwap(new int[]{1, 1}, new int[]{2, 2}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 2}, solution.fairCandySwap(new int[]{1, 2}, new int[]{2, 3}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{2, 3}, solution.fairCandySwap(new int[]{2}, new int[]{1, 3}));
    }
}
