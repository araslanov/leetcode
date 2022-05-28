package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution219_2Test {

    private Solution219_2 solution;

    @Before
    public void setUp() {
        solution = new Solution219_2();
    }

    @Test
    public void test1() {
        assertEquals(true, solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }

    @Test
    public void test2() {
        assertEquals(true, solution.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
    }

    @Test
    public void test3() {
        assertEquals(false, solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }
}
