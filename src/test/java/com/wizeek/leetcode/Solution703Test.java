package com.wizeek.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution703Test {

    private Solution703 solution;

    @Test
    public void test1() {
        Solution703 solution = new Solution703(3, new int[]{4, 5, 8, 2});
        assertEquals(4, solution.add(3));
        assertEquals(5, solution.add(5));
        assertEquals(5, solution.add(10));
        assertEquals(8, solution.add(9));
        assertEquals(8, solution.add(4));
    }
}
