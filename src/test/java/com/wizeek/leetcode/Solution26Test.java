package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution26Test {

    private Solution26 solution;

    @Before
    public void setUp() {
        solution = new Solution26();
    }

    @Test
    public void test1() {
        assertEquals(2, solution.removeDuplicates(new int[]{1, 1, 2}));
    }

    @Test
    public void test2() {
        assertEquals(5, solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
