package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class Solution338_3Test {

    private Solution338_3 solution;

    @Before
    public void setUp() {
        solution = new Solution338_3();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1, 1}, solution.countBits(2));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, solution.countBits(5));
    }
}
