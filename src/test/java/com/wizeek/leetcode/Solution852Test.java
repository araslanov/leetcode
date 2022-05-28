package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution852Test {

    private Solution852 solution;

    @Before
    public void setUp() {
        solution = new Solution852();
    }

    @Test
    public void test1() {
        assertEquals(1, solution.peakIndexInMountainArray(new int[]{0, 1, 0}));
    }

    @Test
    public void test2() {
        assertEquals(1, solution.peakIndexInMountainArray(new int[]{0, 2, 1, 0}));
    }

    @Test
    public void test3() {
        assertEquals(1, solution.peakIndexInMountainArray(new int[]{0, 10, 5, 2}));
    }
}
