package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution1929Test {

    private Solution1929 solution;

    @Before
    public void setUp() {
        solution = new Solution1929();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2, 1, 1, 2, 1}, solution.getConcatenation(new int[]{1, 2, 1}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 3, 2, 1, 1, 3, 2, 1}, solution.getConcatenation(new int[]{1, 3, 2, 1}));
    }
}
