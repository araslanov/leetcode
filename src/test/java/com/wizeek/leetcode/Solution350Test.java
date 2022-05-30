package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution350Test {

    private Solution350 solution;

    @Before
    public void setUp() {
        solution = new Solution350();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 2}, solution.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{4, 9}, solution.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
    }
}
