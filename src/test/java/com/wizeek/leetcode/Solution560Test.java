package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution560Test {

    private Solution560 solution;

    @Before
    public void setUp() {
        solution = new Solution560();
    }

    @Test
    public void test1() {
        assertEquals(2, solution.subarraySum(new int[]{1, 1, 1}, 2));
    }

    @Test
    public void test2() {
        assertEquals(2, solution.subarraySum(new int[]{1, 2, 3}, 3));
    }

    @Test
    public void test3() {
        assertEquals(4, solution.subarraySum(new int[]{1, 2, 1, 2, 1}, 3));
    }
}
