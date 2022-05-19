package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1200Test {

    private Solution1200 solution;

    @Before
    public void setUp() {
        solution = new Solution1200();
    }

    @Test
    public void test1() {
        assertEquals(3, solution.minimumAbsDifference(new int[]{4, 2, 1, 3}).size());
    }
}
