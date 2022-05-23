package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1991Test {

    private Solution1991 solution;

    @Before
    public void setUp() {
        solution = new Solution1991();
    }

    @Test
    public void test1() {
        assertEquals(3, solution.findMiddleIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution.findMiddleIndex(new int[]{1, 2, 3}));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.findMiddleIndex(new int[]{2, 1, -1}));
    }
}
