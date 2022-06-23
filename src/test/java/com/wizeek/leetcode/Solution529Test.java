package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution529Test {

    private Solution529 solution;

    @Before
    public void setUp() {
        solution = new Solution529();
    }

    @Test
    public void test1() {
        char[][] initial = new char[][]{{'E', 'E', 'E', 'E', 'E'}, {'E', 'E', 'M', 'E', 'E'}, {'E', 'E', 'E', 'E', 'E'}, {
                'E', 'E', 'E', 'E', 'E'}};
        char[][] expected = new char[][]{{'B', '1', 'E', '1', 'B'}, {'B', '1', 'M', '1', 'B'}, {'B', '1', '1', '1', 'B'}, {
                'B', 'B', 'B', 'B', 'B'}};

        assertArrayEquals(expected, solution.updateBoard(initial, new int[]{3, 0}));
    }

    @Test
    public void test2() {
        char[][] initial = new char[][]{{'B', '1', 'E', '1', 'B'}, {'B', '1', 'M', '1', 'B'}, {'B', '1', '1', '1', 'B'}, {
                'B', 'B', 'B', 'B', 'B'}};
        char[][] expected = new char[][]{{'B', '1', 'E', '1', 'B'}, {'B', '1', 'X', '1', 'B'}, {'B', '1', '1', '1', 'B'}, {
                'B', 'B', 'B', 'B', 'B'}};

        assertArrayEquals(expected, solution.updateBoard(initial, new int[]{1, 2}));
    }
}
