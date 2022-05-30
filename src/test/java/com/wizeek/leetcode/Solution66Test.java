package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution66Test {

    private Solution66 solution;

    @Before
    public void setUp() {
        solution = new Solution66();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2, 4}, solution.plusOne(new int[]{1, 2, 3}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 0}, solution.plusOne(new int[]{9}));
    }
}
