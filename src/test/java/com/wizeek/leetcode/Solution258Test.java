package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution258Test {

    private Solution258 solution;

    @Before
    public void setUp() {
        solution = new Solution258();
    }

    @Test
    public void test1() {
        assertEquals(2, solution.addDigits(38));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.addDigits(0));
    }
}
