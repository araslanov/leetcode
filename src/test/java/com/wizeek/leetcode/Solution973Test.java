package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution973Test {

    private Solution973 solution;

    @Before
    public void setUp() {
        solution = new Solution973();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[][]{{-2, 2}}, solution.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[][]{{-2, 4}, {3, 3}}, solution.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2));
    }
}
