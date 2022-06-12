package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution791_2Test {

    private Solution791_2 solution;

    @Before
    public void setUp() {
        solution = new Solution791_2();
    }

    @Test
    public void test1() {
        assertEquals("cbad", solution.customSortString("cba", "abcd"));
    }

    @Test
    public void test2() {
        assertEquals("cbad", solution.customSortString("cbafg", "abcd"));
    }
}
