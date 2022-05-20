package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution1470Test {

    private Solution1470 solution;

    @Before
    public void setUp() {
        solution = new Solution1470();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, solution.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 4, 2, 3, 3, 2, 4, 1}, solution.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{1, 2, 1, 2}, solution.shuffle(new int[]{1, 1, 2, 2}, 2));
    }
}
