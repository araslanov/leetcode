package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution867Test {

    private Solution867 solution;

    @Before
    public void setUp() {
        solution = new Solution867();
    }

    @Test
    public void test1() {
        assertEquals(new int[][]{{1, 4, 7}, {2, 5, 8}, {3, 6, 9}},
                solution.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    @Test
    public void test2() {
        assertEquals(new int[][]{{1, 4}, {2, 5}, {3, 6}}, solution.transpose(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }
}
