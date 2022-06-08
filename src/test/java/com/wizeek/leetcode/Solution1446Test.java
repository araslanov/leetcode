package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1446Test {

    private Solution1446 solution;

    @Before
    public void setUp() {
        solution = new Solution1446();
    }

    @Test
    public void test1() {
        assertEquals(2, solution.maxPower("leetcode"));
    }

    @Test
    public void test2() {
        assertEquals(5, solution.maxPower("abbcccddddeeeeedcba"));
    }
}
