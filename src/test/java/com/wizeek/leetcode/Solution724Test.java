package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution724Test {

    private Solution724 solution;

    @Before
    public void setUp() {
        solution = new Solution724();
    }

    @Test
    public void test1() {
        assertEquals(3, solution.pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution.pivotIndex(new int[]{1, 2, 3}));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.pivotIndex(new int[]{2, 1, -1}));
    }
}
