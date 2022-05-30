package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution350_2Test {

    private Solution350_2 solution;

    @Before
    public void setUp() {
        solution = new Solution350_2();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 2}, solution.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{9, 4}, solution.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
    }
}
