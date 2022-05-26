package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution155Test {

    private Solution155 solution;

    @Before
    public void setUp() {
        solution = new Solution155();
    }

    @Test
    public void test1() {
        solution.push(-2);
        solution.push(0);
        solution.push(-3);
        assertEquals(-3, solution.getMin());
        solution.pop();
        assertEquals(0, solution.top());
        assertEquals(-2, solution.getMin());
    }
}
