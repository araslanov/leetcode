package com.wizeek.leetcode.p48;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        solution.rotate(matrix);

        assertEquals(7, matrix[0][0]);
    }

    @Test
    public void test2() {
        int[][] matrix = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};

        solution.rotate(matrix);

        assertEquals(15, matrix[0][0]);
    }
}
