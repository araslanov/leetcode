package com.wizeek.leetcode.p1710;

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
        assertEquals(8, solution.maximumUnits(new int[][]{{1, 3}, {2, 2}, {3, 1}}, 4));
    }

    @Test
    public void test2() {
        assertEquals(91, solution.maximumUnits(new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}}, 10));
    }

    @Test
    public void test3() {
        assertEquals(2, solution.maximumUnits(new int[][]{{10, 1}}, 2));
    }

    @Test
    public void test4() {
        assertEquals(48, solution.maximumUnits(
                new int[][]{{2, 1}, {4, 4}, {3, 1}, {4, 1}, {2, 4}, {3, 4}, {1, 3}, {4, 3}, {5, 3}, {5, 3}}, 13));
    }
}
