package com.wizeek.leetcode.p1260;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        List<List<Integer>> result = solution.shiftGrid(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1);

        assertEquals(9, (int) result.get(0).get(0));
    }

    @Test
    public void test2() {
        List<List<Integer>> result = solution.shiftGrid(
                new int[][]{{3, 8, 1, 9}, {19, 7, 2, 5}, {4, 6, 11, 10}, {12, 0, 21, 13}}, 4);

        assertEquals(12, (int) result.get(0).get(0));
    }
}
