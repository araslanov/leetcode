package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution791Test {

    private Solution791 solution;

    @Before
    public void setUp() {
        solution = new Solution791();
    }

    @Test
    public void test1() {
        assertEquals("cbad", solution.customSortString("cba", "abcd"));
    }

    @Test
    public void test2() {
        assertEquals("cdba", solution.customSortString("cbafg", "abcd"));
    }
}
