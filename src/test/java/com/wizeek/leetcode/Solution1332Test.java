package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1332Test {

    private Solution1332 solution;

    @Before
    public void setUp() {
        solution = new Solution1332();
    }

    @Test
    public void test1() {
        assertEquals(1, solution.removePalindromeSub("ababa"));
    }

    @Test
    public void test2() {
        assertEquals(2, solution.removePalindromeSub("abb"));
    }

    @Test
    public void test3() {
        assertEquals(2, solution.removePalindromeSub("baabb"));
    }
}
