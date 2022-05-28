package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution35Test {

    private Solution35 solution;

    @Before
    public void setUp() {
        solution = new Solution35();
    }

    @Test
    public void test1() {
        assertEquals(2, solution.searchInsert(new int[]{1, 3, 5, 6}, 5));
    }

    @Test
    public void test2() {
        assertEquals(1, solution.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    @Test
    public void test3() {
        assertEquals(4, solution.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}
