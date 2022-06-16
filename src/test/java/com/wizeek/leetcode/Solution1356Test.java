package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution1356Test {

    private Solution1356 solution;

    @Before
    public void setUp() {
        solution = new Solution1356();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 1, 2, 4, 8, 3, 5, 6, 7},
                solution.sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024},
                solution.sortByBits(new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1}));
    }
}
