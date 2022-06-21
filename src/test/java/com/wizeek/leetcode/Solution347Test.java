package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution347Test {

    private Solution347 solution;

    @Before
    public void setUp() {
        solution = new Solution347();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 2}, solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1}, solution.topKFrequent(new int[]{1}, 1));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{1, 2}, solution.topKFrequent(new int[]{1, 2}, 2));
    }
}
