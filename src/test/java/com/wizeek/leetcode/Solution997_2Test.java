package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution997_2Test {

    private Solution997_2 solution;

    @Before
    public void setUp() {
        solution = new Solution997_2();
    }

    @Test
    public void test1() {
        assertEquals(2, solution.findJudge(2, new int[][]{{1, 2}}));
    }

    @Test
    public void test2() {
        assertEquals(3, solution.findJudge(3, new int[][]{{1, 3}, {2, 3}}));
    }

    @Test
    public void test3() {
        assertEquals(-1, solution.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}));
    }
}
