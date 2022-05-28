package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution905_2Test {

    private Solution905_2 solution;

    @Before
    public void setUp() {
        solution = new Solution905_2();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 4, 3, 1}, solution.sortArrayByParity(new int[]{3, 1, 2, 4}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{0}, solution.sortArrayByParity(new int[]{0}));
    }
}
