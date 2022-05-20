package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution509Test {

    private Solution509 solution;

    @Before
    public void setUp() {
        solution = new Solution509();
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
