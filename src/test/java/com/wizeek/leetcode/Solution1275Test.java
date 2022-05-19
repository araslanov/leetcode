package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1275Test {

    private Solution1275 solution;

    @Before
    public void setUp() {
        solution = new Solution1275();
    }

    @Test
    public void test1() {
        assertEquals("A", solution.tictactoe(new int[][]{{0, 0}, {2, 0}, {1, 1}, {2, 1}, {2, 2}}));
    }

    @Test
    public void test2() {
        assertEquals("B", solution.tictactoe(new int[][]{{0, 0}, {1, 1}, {0, 1}, {0, 2}, {1, 0}, {2, 0}}));
    }
}
