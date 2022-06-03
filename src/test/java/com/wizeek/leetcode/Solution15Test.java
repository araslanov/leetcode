package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution15Test {

    private Solution15 solution;

    @Before
    public void setUp() {
        solution = new Solution15();
    }

    @Test
    public void test1() {
        List<List<Integer>> result = solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        assertEquals(2, result.size());
        assertEquals(-1, (int) result.get(0).get(0));
        assertEquals(0, (int) result.get(0).get(1));
        assertEquals(1, (int) result.get(0).get(2));
        assertEquals(-1, (int) result.get(1).get(0));
        assertEquals(-1, (int) result.get(1).get(1));
        assertEquals(2, (int) result.get(1).get(2));
    }
}
