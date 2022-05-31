package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution463Test {

    private Solution463 solution;

    @Before
    public void setUp() {
        solution = new Solution463();
    }

    @Test
    public void test1() {
        assertEquals(16, solution.islandPerimeter(new int[][]{{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}}));
    }

    @Test
    public void test2() {
        assertEquals(4, solution.islandPerimeter(new int[][]{{1}}));
    }

    @Test
    public void test3() {
        assertEquals(4, solution.islandPerimeter(new int[][]{{1, 0}}));
    }

    @Test
    public void test4() {
        assertEquals(4, solution.islandPerimeter(new int[][]{{0, 1}}));
    }
}
