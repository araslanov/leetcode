package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution528Test {

    private Solution528 solution;

    @Before
    public void setUp() {
    }

    @Test
    public void test1() {
        solution = new Solution528(new int[]{1});

        assertEquals(0, solution.pickIndex());
    }
}
