package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution28Test {

    private Solution28 solution;

    @Before
    public void setUp() {
        solution = new Solution28();
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
