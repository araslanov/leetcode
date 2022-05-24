package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution69Test {

    private Solution69 solution;

    @Before
    public void setUp() {
        solution = new Solution69();
    }

    @Test
    public void test1() {
        assertEquals(2, solution.mySqrt(4));
    }

    @Test
    public void test2() {
        assertEquals(2, solution.mySqrt(8));
    }

    @Test
    public void test3() {
        assertEquals(46340, solution.mySqrt(2147395600));
    }

    @Test
    public void test4() {
        assertEquals(0, solution.mySqrt(0));
    }

    @Test
    public void test5() {
        assertEquals(1, solution.mySqrt(2));
    }
}
