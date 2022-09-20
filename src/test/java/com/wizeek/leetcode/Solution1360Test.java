package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1360Test {

    private Solution1360 solution;

    @Before
    public void setUp() {
        solution = new Solution1360();
    }

    @Test
    public void test1() {
        assertEquals(100, solution.daysBetweenDates("2100-03-22", "2099-12-12"));
    }

    @Test
    public void test2() {
        assertEquals(1, solution.daysBetweenDates("2019-06-29", "2019-06-30"));
    }

    @Test
    public void test3() {
        assertEquals(15, solution.daysBetweenDates("2020-01-15", "2019-12-31"));
    }
}
