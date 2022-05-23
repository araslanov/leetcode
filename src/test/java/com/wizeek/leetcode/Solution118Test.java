package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution118Test {

    private Solution118 solution;

    @Before
    public void setUp() {
        solution = new Solution118();
    }

    @Test
    public void test1() {
        List<List<Integer>> result = solution.generate(5);

        assertEquals(5, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals(5, result.get(4).size());
        assertEquals(6, (int) result.get(4).get(2));
    }
}
