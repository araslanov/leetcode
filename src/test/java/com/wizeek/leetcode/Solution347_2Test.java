package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution347_2Test {

    private Solution347_2 solution;

    @Before
    public void setUp() {
        solution = new Solution347_2();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 1}, solution.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1}, solution.topKFrequent(new int[]{1}, 1));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{1, 2}, solution.topKFrequent(new int[]{1, 2}, 2));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{11, 10, 5, 7, 8, 2, 6, 3, 4, 1}, solution.topKFrequent(
                new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6, 7, 7, 8, 2, 3, 1, 1, 1, 10, 11, 5, 6, 2, 4, 7, 8, 5, 6}, 10));
    }
}
