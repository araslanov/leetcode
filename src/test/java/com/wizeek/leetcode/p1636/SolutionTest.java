package com.wizeek.leetcode.p1636;

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
        assertArrayEquals(new int[]{3, 1, 1, 2, 2, 2}, solution.frequencySort(new int[]{1, 1, 2, 2, 2, 3}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 3, 3, 2, 2}, solution.frequencySort(new int[]{2, 3, 1, 3, 2}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{5, -1, 4, 4, -6, -6, 1, 1, 1},
                solution.frequencySort(new int[]{-1, 1, -6, 4, 5, -6, 1, 4, 1}));
    }
}
