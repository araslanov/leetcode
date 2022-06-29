package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution134Test {

    private Solution134 solution;

    @Before
    public void setUp() {
        solution = new Solution134();
    }

    @Test
    public void test1() {
        assertEquals(3, solution.canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution.canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }
}
