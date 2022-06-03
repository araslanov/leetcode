package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution1762_2Test {

    private Solution1762_2 solution;

    @Before
    public void setUp() {
        solution = new Solution1762_2();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{0, 2, 3}, solution.findBuildings(new int[]{4, 2, 3, 1}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{0, 1, 2, 3}, solution.findBuildings(new int[]{4, 3, 2, 1}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{3}, solution.findBuildings(new int[]{1, 3, 2, 4}));
    }
}
