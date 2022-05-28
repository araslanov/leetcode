package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution905Test {

    private Solution905 solution;

    @Before
    public void setUp() {
        solution = new Solution905();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{4, 2, 1, 3}, solution.sortArrayByParity(new int[]{3, 1, 2, 4}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{0}, solution.sortArrayByParity(new int[]{0}));
    }
}
