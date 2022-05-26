package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution231_4Test {

    private Solution231_4 solution;

    @Before
    public void setUp() {
        solution = new Solution231_4();
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

    @Test
    public void test4() {
        assertEquals(false, solution.isPowerOfTwo(0));
    }
}
