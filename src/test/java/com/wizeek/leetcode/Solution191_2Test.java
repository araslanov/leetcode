package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution191_2Test {

    private Solution191 solution;

    @Before
    public void setUp() {
        solution = new Solution191();
    }

    @Test
    public void test1() {
        assertEquals(3, solution.hammingWeight(11));
    }
}
