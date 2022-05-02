package com.wizeek.leetcode.p14;

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
        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    public void test2() {
        assertEquals("", solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    @Test
    public void test3() {
        assertEquals("dog", solution.longestCommonPrefix(new String[]{"dog"}));
    }

    @Test
    public void test4() {
        assertEquals("", solution.longestCommonPrefix(new String[]{"", "dog"}));
    }
}
