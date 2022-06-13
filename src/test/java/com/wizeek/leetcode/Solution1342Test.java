package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1342Test {

    private Solution1342 solution;

    @Before
    public void setUp() {
        solution = new Solution1342();
    }

    @Test
    public void test1() {
        assertEquals(6, solution.numberOfSteps(14));
    }

    @Test
    public void test2() {
        assertEquals(4, solution.numberOfSteps(8));
    }

    @Test
    public void test3() {
        assertEquals(12, solution.numberOfSteps(123));
    }
}
