package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution243Test {

    private Solution243 solution;

    @Before
    public void setUp() {
        solution = new Solution243();
    }

    @Test
    public void test1() {
        assertEquals(3,
                solution.shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "coding",
                        "practice"));
    }

    @Test
    public void test2() {
        assertEquals(1,
                solution.shortestDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"}, "makes",
                        "coding"));
    }
}
