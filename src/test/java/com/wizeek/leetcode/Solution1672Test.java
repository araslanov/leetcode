package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1672Test {

    private Solution1672 solution;

    @Before
    public void setUp() {
        solution = new Solution1672();
    }

    @Test
    public void test1() {
        assertEquals(6, solution.maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}}));
    }

    @Test
    public void test2() {
        assertEquals(10, solution.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}}));
    }

    @Test
    public void test3() {
        assertEquals(17, solution.maximumWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}));
    }
}
