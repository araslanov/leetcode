package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution231Test {

    private Solution231 solution;

    @Before
    public void setUp() {
        solution = new Solution231();
    }

    @Test
    public void test1() {
        assertEquals(true, solution.isPowerOfTwo(1));
    }

    @Test
    public void test2() {
        assertEquals(true, solution.isPowerOfTwo(16));
    }

    @Test
    public void test3() {
        assertEquals(false, solution.isPowerOfTwo(3));
    }
}
