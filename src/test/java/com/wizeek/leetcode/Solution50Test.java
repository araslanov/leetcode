package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution50Test {

    private Solution50 solution;

    @Before
    public void setUp() {
        solution = new Solution50();
    }

    @Test
    public void test1() {
        assertEquals(1024.0, solution.myPow(2.0, 10), 0.00001);
    }

    @Test
    public void test2() {
        assertEquals(9.261, solution.myPow(2.1, 3), 0.00001);
    }

    @Test
    public void test3() {
        assertEquals(0.25, solution.myPow(2.0, -2), 0.00001);
    }

    @Test
    public void test4() {
        assertEquals(1.0, solution.myPow(1.0, Integer.MAX_VALUE), 0.00001);
    }

    @Test
    public void test5() {
        assertEquals(0.0, solution.myPow(2.0, Integer.MIN_VALUE), 0.00001);
    }
}
