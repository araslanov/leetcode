package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution268_2Test {

    private Solution268_2 solution;

    @Before
    public void setUp() {
        solution = new Solution268_2();
    }

    @Test
    public void test1() {
        assertEquals(2, solution.missingNumber(new int[]{3, 0, 1}));
    }

    @Test
    public void test2() {
        assertEquals(2, solution.missingNumber(new int[]{0, 1}));
    }

    @Test
    public void test3() {
        assertEquals(8, solution.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }
}
