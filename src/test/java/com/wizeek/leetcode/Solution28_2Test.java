package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution28_2Test {

    private Solution28_2 solution;

    @Before
    public void setUp() {
        solution = new Solution28_2();
    }

    @Test
    public void test1() {
        assertEquals(2, solution.strStr("hello", "ll"));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution.strStr("aaaaa", "bba"));
    }
}
