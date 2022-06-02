package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution200Test {

    private Solution200 solution;

    @Before
    public void setUp() {
        solution = new Solution200();
    }

    @Test
    public void test1() {
        assertEquals(1, solution.numIslands(new char[][]{{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {
                '1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}}));
    }

    @Test
    public void test2() {
        assertEquals(3, solution.numIslands(
                new char[][]{{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}}));
    }
}
