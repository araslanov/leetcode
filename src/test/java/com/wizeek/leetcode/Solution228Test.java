package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution228Test {

    private Solution228 solution;

    @Before
    public void setUp() {
        solution = new Solution228();
    }

    @Test
    public void test1() {
        List<String> result = solution.summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
        assertEquals("0->2", result.get(0));
        assertEquals("4->5", result.get(1));
        assertEquals("7", result.get(2));
    }
}
