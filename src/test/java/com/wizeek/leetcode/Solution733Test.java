package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class Solution733Test {

    private Solution733 solution;

    @Before
    public void setUp() {
        solution = new Solution733();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}},
                solution.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 2}},
                solution.floodFill(new int[][]{{0, 0, 0}, {0, 0, 0}}, 0, 0, 2));
    }
}
