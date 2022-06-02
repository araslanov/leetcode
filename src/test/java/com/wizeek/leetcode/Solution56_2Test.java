package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution56_2Test {

    private Solution56_2 solution;

    @Before
    public void setUp() {
        solution = new Solution56_2();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}},
                solution.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[][]{{1, 5}}, solution.merge(new int[][]{{1, 4}, {4, 5}}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[][]{{1, 3}, {4, 5}}, solution.merge(new int[][]{{1, 3}, {4, 5}}));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[][]{{1, 1}}, solution.merge(new int[][]{{1, 1}}));
    }
}
