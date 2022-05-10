package com.wizeek.leetcode.p1920;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1, 2, 4, 5, 3}, solution.buildArray(new int[]{0, 2, 1, 5, 3, 4}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{4, 5, 0, 1, 2, 3}, solution.buildArray(new int[]{5, 0, 1, 2, 3, 4}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{2, 4, 3, 0, 5, 1}, solution.buildArray(new int[]{5, 3, 1, 4, 0, 2}));
    }
}
