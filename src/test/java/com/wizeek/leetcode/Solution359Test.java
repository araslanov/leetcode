package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution359Test {

    private Solution359 solution;

    @Before
    public void setUp() {
        solution = new Solution359();
    }

    @Test
    public void test1() {
        assertEquals(true, solution.shouldPrintMessage(1, "foo"));
        assertEquals(true, solution.shouldPrintMessage(2, "bar"));
        assertEquals(false, solution.shouldPrintMessage(3, "foo"));
        assertEquals(false, solution.shouldPrintMessage(8, "bar"));
        assertEquals(false, solution.shouldPrintMessage(10, "foo"));
        assertEquals(true, solution.shouldPrintMessage(11, "foo"));
    }
}
