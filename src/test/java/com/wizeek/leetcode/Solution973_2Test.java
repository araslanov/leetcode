package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution973_2Test {

    private Solution973_2 solution;

    @Before
    public void setUp() {
        solution = new Solution973_2();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[][]{{-2, 2}}, solution.kClosest(new int[][]{{1, 3}, {-2, 2}}, 1));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[][]{{3, 3}, {-2, 4}}, solution.kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[][]{{1, 1}},
                solution.kClosest(new int[][]{{2, 2}, {2, 2}, {2, 2}, {2, 2}, {2, 2}, {2, 2}, {1, 1}}, 1));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[][]{{1, 0}, {0, 1}}, solution.kClosest(new int[][]{{0, 1}, {1, 0}}, 2));
    }
}
