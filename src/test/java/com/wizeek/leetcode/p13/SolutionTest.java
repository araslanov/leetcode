package com.wizeek.leetcode.p13;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals(3, solution.romanToInt("III"));
    }

    @Test
    public void test2() {
        assertEquals(58, solution.romanToInt("LVIII"));
    }

    @Test
    public void test3() {
        assertEquals(1994, solution.romanToInt("MCMXCIV"));
    }
}
