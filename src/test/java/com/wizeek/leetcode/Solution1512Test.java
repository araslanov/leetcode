package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1512Test {

    private Solution1512 solution;

    @Before
    public void setUp() {
        solution = new Solution1512();
    }

    @Test
    public void test1() {
        assertEquals(4, solution.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }

    @Test
    public void test2() {
        assertEquals(6, solution.numIdenticalPairs(new int[]{1, 1, 1, 1}));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.numIdenticalPairs(new int[]{1, 2, 3}));
    }
}
