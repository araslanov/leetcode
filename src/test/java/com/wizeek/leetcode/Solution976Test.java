package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution976Test {

    private Solution976 solution;

    @Before
    public void setUp() {
        solution = new Solution976();
    }

    @Test
    public void test1() {
        assertEquals(5, solution.largestPerimeter(new int[]{2, 1, 2}));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.largestPerimeter(new int[]{1, 2, 1}));
    }
}
