package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution509_3Test {

    private Solution509_3 solution;

    @Before
    public void setUp() {
        solution = new Solution509_3();
    }

    @Test
    public void test1() {
        assertEquals(1, solution.fib(2));
    }

    @Test
    public void test2() {
        assertEquals(2, solution.fib(3));
    }

    @Test
    public void test3() {
        assertEquals(3, solution.fib(4));
    }
}
