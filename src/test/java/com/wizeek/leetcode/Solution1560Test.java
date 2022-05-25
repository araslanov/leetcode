package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution1560Test {

    private Solution1560 solution;

    @Before
    public void setUp() {
        solution = new Solution1560();
    }

    @Test
    public void test1() {
        List<Integer> result = solution.mostVisited(4, new int[]{1, 3, 1, 2});

        assertEquals(2, result.size());
        assertEquals(1, (int) result.get(0));
        assertEquals(2, (int) result.get(1));
    }

    @Test
    public void test2() {
        List<Integer> result = solution.mostVisited(7, new int[]{1, 3, 5, 7});

        assertEquals(7, result.size());
        assertEquals(1, (int) result.get(0));
        assertEquals(7, (int) result.get(6));
    }
}
