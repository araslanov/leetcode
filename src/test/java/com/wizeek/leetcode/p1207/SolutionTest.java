package com.wizeek.leetcode.p1207;

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
        assertEquals(true, solution.uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
    }

    @Test
    public void test2() {
        assertEquals(false, solution.uniqueOccurrences(new int[]{1, 2}));
    }

    @Test
    public void test3() {
        assertEquals(true, solution.uniqueOccurrences(new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}));
    }
}
