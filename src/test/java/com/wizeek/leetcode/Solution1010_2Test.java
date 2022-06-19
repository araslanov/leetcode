package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1010_2Test {

    private Solution1010_2 solution;

    @Before
    public void setUp() {
        solution = new Solution1010_2();
    }

    @Test
    public void test1() {
        assertEquals(3, solution.numPairsDivisibleBy60(new int[]{30, 20, 150, 100, 40}));
    }

    @Test
    public void test2() {
        assertEquals(3, solution.numPairsDivisibleBy60(new int[]{60, 60, 60}));
    }
}
