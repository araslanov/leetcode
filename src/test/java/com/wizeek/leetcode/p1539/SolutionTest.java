package com.wizeek.leetcode.p1539;

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
        assertEquals(9, solution.findKthPositive(new int[]{2, 3, 4, 7, 11}, 5));
    }

    @Test
    public void test2() {
        assertEquals(6, solution.findKthPositive(new int[]{1, 2, 3, 4}, 2));
    }

    @Test
    public void test3() {
        assertEquals(3, solution.findKthPositive(new int[]{1, 5}, 2));
    }
}
