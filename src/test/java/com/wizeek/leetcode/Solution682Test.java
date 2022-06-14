package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution682Test {

    private Solution682 solution;

    @Before
    public void setUp() {
        solution = new Solution682();
    }

    @Test
    public void test1() {
        assertEquals(30, solution.calPoints(new String[]{"5", "2", "C", "D", "+"}));
    }

    @Test
    public void test2() {
        assertEquals(27, solution.calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.calPoints(new String[]{"1", "C"}));
    }
}
